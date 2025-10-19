class Solution{
    public String findLexSmallestString(String s,int a,int b){
        Queue<String> q=new LinkedList<>();
        Set<String> vis=new HashSet<>();
        q.offer(s);
        vis.add(s);
        String ans=s;
        while(!q.isEmpty()){
            String c=q.poll();
            if(c.compareTo(ans)<0) ans=c;
            char[] ch=c.toCharArray();
            for(int i=1;i<ch.length;i+=2) ch[i]=(char)((ch[i]-'0'+a)%10+'0');
            String add=new String(ch);
            if(vis.add(add)) q.offer(add);
            String rot=c.substring(c.length()-b)+c.substring(0,c.length()-b);
            if(vis.add(rot)) q.offer(rot);
        }
        return ans;
    }
}
