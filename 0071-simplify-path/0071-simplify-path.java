
class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();

        for (String part : path.split("/")) {

            if (part.equals("") || part.equals(".")) {
                continue;
            } 
            else if (part.equals("..")) {
                if (!stack.isEmpty()) stack.pollLast();
            } 
            else {
                stack.offerLast(part);
            }
        }

        // build result
        StringBuilder res = new StringBuilder();

        while (!stack.isEmpty()) {
            res.append("/").append(stack.pollFirst());
        }

        return res.length() == 0 ? "/" : res.toString();
    }
}