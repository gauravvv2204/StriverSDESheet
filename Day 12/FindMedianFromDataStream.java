//https://leetcode.com/problems/find-median-from-data-stream/submissions/
class MedianFinder {
     MinHeap minPq;
     MaxHeap maxPq;
     boolean even = true;
    public MedianFinder() {
        minPq = new MinHeap();
        maxPq = new MaxHeap();
    }
    
    public void addNum(int num) {
        if(even){
            if(minPq.size==0 || minPq.top()>num){
                maxPq.insert(num);
            }
            else{
                int temp = minPq.delete();
                maxPq.insert(temp);
                minPq.insert(num);
            }
            even = false;
        }
        else{
            if(maxPq.top()<=num){
                minPq.insert(num);
            }
            else{
                int temp = maxPq.delete();
                minPq.insert(temp);
                maxPq.insert(num);
            }
            even = true;
        }
    }
    
    public double findMedian() {
        if(even){
            return (double)(minPq.top()+maxPq.top())/2;
        }
        else{
            return maxPq.top();
        }
    }
}
class MaxHeap{
    private List<Integer> list;
    public int size;
    MaxHeap(){
        list = new ArrayList<>();
        list.add(-1);
        size = 0;
    }
    public void insert(int num){
        size = size+1;
        list.add(num);
        int currIndex = size;
        int parentIndex = (currIndex)/2;
        while( parentIndex > 0 && list.get(parentIndex)<list.get(currIndex)){
            int temp = list.get(parentIndex);
            list.set(parentIndex,list.get(currIndex));
            list.set(currIndex,temp);
            currIndex = parentIndex;
            parentIndex = currIndex/2;
        }
    }
    public int delete(){
        int index = 1;
        int val = list.get(index);
        list.set(index,list.get(size));
        list.remove(size);
        size = size - 1;
        
        int smallest;
        while(index<size){
            smallest = index;
        if(2*index<=size && list.get(2*index)>list.get(smallest))
            smallest = 2*index;
        if(2*index+1<=size && list.get(2*index+1)>list.get(smallest))
            smallest = 2*index+1;
        if(smallest!=index){
            int temp = list.get(smallest);
            list.set(smallest,list.get(index));
            list.set(index,temp);
            index = smallest;
        }
        else{
            break;
        }
        }
        return val;
    }
    public int top(){
        if(size>0)
        return list.get(1);
        return -1;
    }
}
class MinHeap{
    private List<Integer> list;
    public int size;
    MinHeap(){
        list = new ArrayList<>();
        list.add(-1);
        size = 0;
    }
    public void insert(int num){
        size = size+1;
        list.add(num);
        int currIndex = size;
        int parentIndex = (currIndex)/2;
        while( parentIndex > 0 && list.get(parentIndex)>list.get(currIndex)){
            int temp = list.get(parentIndex);
            list.set(parentIndex,list.get(currIndex));
            list.set(currIndex,temp);
            currIndex = parentIndex;
            parentIndex = currIndex/2;
        }
    }
    public int delete(){
        int index = 1;
        int val = list.get(index);
        list.set(index,list.get(size));
        list.remove(size);
        size = size - 1;
        
        int smallest;
        while(index<size){
            smallest = index;
        if(2*index<=size && list.get(2*index)<list.get(smallest))
            smallest = 2*index;
        if(2*index+1<=size && list.get(2*index+1)<list.get(smallest))
            smallest = 2*index+1;
        if(smallest!=index){
            int temp = list.get(smallest);
            list.set(smallest,list.get(index));
            list.set(index,temp);
            index = smallest;
        }
        else{
            break;
        }
        }
        return val;
    }
    public int top(){
        if(size>0)
        return list.get(1);
        return -1;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
