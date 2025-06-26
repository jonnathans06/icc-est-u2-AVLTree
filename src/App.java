public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Nombre: Jonnathan Saavedra");

        AVLTree tree = new AVLTree();

        tree.insert(10);
        tree.insert(20);
        tree.insert(15);
        
        System.out.println(tree);
    }
}
