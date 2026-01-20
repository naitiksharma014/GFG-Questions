class Solution {
    StringBuilder docs = new StringBuilder();
    Stack<Character> undo = new Stack<>();
    Stack<Character> redo = new Stack<>();
    
    public void append(char x) {
        // append x into document
        docs.append(x);
        undo.push(x);
        redo.clear();
    }

    public void undo() {
        // undo last change
        if(undo.isEmpty()) return;
        
        char ch = undo.pop();
        redo.push(ch);
        docs.deleteCharAt(docs.length() - 1);
    }

    public void redo() {
        // redo changes
        if(redo.isEmpty()) return;
        
        char ch = redo.pop();
        docs.append(ch);
        undo.push(ch);
    }

    public String read() {
        // read the document
        return docs.toString();
    }
}
