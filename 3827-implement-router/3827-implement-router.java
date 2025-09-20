class Router {

    private static class Node{
        int source,dest,timestamp;
        Node(int s,int d,int t){
            source=s;
            dest=d;
            timestamp=t;
        }
    }

    private int capacity;
    private LinkedList<Node> queue;
    private Set<String> dupes;
    private Map<Integer,ArrayList<Integer>> destMap;

    public Router(int memoryLimit){
        capacity=memoryLimit;
        queue=new LinkedList<>();
        dupes=new HashSet<>();
        destMap=new HashMap<>();
    }

    public boolean addPacket(int source,int dest,int timestamp){
        String key=source+"-"+dest+"-"+timestamp;
        if(dupes.contains(key)) return false;

        while(queue.size()>=capacity){
            Node old=queue.removeFirst();
            String oldKey=old.source+"-"+old.dest+"-"+old.timestamp;
            dupes.remove(oldKey);

            ArrayList<Integer> list=destMap.get(old.dest);
            list.remove(0);
            if(list.isEmpty()) destMap.remove(old.dest);
        }

        Node node=new Node(source,dest,timestamp);
        queue.addLast(node);
        dupes.add(key);

        destMap.putIfAbsent(dest,new ArrayList<>());
        destMap.get(dest).add(timestamp);

        return true;
    }

    public int[] forwardPacket(){
        if(queue.isEmpty()) return new int[0];

        Node node=queue.removeFirst();
        String key=node.source+"-"+node.dest+"-"+node.timestamp;
        dupes.remove(key);

        ArrayList<Integer> list=destMap.get(node.dest);
        list.remove(0);
        if(list.isEmpty()) destMap.remove(node.dest);

        return new int[]{node.source,node.dest,node.timestamp};
    }

    public int getCount(int dest,int startTime,int endTime){
        if(!destMap.containsKey(dest)) return 0;
        ArrayList<Integer> list=destMap.get(dest);

          int left=0,right=list.size()-1,l=list.size(); 
        while(left<=right){
            int mid=(left+right)/2;
            if(list.get(mid)>=startTime){l=mid;right=mid-1;}
            else left=mid+1;
        }

        left=0;right=list.size()-1;int r=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(list.get(mid)<=endTime){r=mid;left=mid+1;}
            else right=mid-1;
        }

        return r-l+1;
    }
}
