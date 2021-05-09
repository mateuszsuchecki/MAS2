//import java.util.Map;
//import java.util.TreeMap;
//
//public class Person {
//
//    private String firsName;
//    private String lastName;
//    private Map<String, Product> productQualifier = new TreeMap<>();
//
//
//    public Person(String firsName, String lastName) {
//        this.firsName = firsName;
//        this.lastName = lastName;
//    }
//
//    public void addProductQualifier(Product product) {
//        if(!productQualifier.containsKey(product.getName())) {
//            productQualifier.put(product.getName(), product);
//
//            // Add the reverse connection
////            product.addActor(this);
//        }
//    }
//
//    public Fridge findMovieQualif(String title) throws Exception {
//        // Check if we have the info
////        if(!moviesQualif.containsKey(title)) {
////            throw new Exception("Unable to find a movie: " + title);
////        }
////
////        return moviesQualif.get(title);
//    }
//}
//
