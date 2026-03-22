
import javax.swing.JOptionPane;

public class palindrome {
      
    public class stackNode{
        char c;
        stackNode next;
        
    }
    
    stackNode top = null;
    stackNode thisNd;
    
    public void push (char c) {
        thisNd = new stackNode();
        thisNd.c = c;
        thisNd.next = top;
        top = thisNd;
        
    }
    
    public char pop () {
        char rc = top.c;
        top = top.next;
        return rc;

    }
    
    public void stack() {
        System.out.println("");
        String word = JOptionPane.showInputDialog(null, "Check for palindrome : ");
        char c;
        int i = 0;
        
        do {
            c = word.charAt(i);
            push(c);
            i++;
        
        } while (i < word.length());
    
        String rword = "";
        do {
            rword += pop();
        
        
        } while (top != null);
        
        if (word.equalsIgnoreCase(rword))
            JOptionPane.showMessageDialog(null, word + " is a palindrome");
        else 
            JOptionPane.showMessageDialog(null, word + " is not a palindrome");
    }
    
    public static void main(String[] args) {
        new palindrome().stack();
    }
    
}
