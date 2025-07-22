package Trees;

public class q33_sumOfPath {

    int sumOfPath(String path){
        int sum = 0;
        TreeNode current = root;

        for(char dir : path.toCharArray()){
            if(current != null) {
                sum += current.getData();
                if(dir == '0'){
                    current = current.getLeft();
                } else if(dir == '1'){
                    current = current.getRight();
                }
                if(current.left!=null){
                    sum += current.left.getData();
                }
                if(current.right!=null){
                    sum+= current.right.getData();
                }
            }
        }
    }

    }
