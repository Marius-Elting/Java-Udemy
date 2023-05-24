public class NextMain {
    public static void main(String[] args) {
        // Movie movie = Movie.getMovie("A", "Jaws");
        // movie.watchMovie();

        // Adventure jaws = (Adventure) Movie.getMovie("C", "Jaws");
        // jaws.watchMovie();

        // Object comedy = Movie.getMovie("C", "Airplane");
        // Comedy comedyMovie = (Comedy) comedy;
        // comedyMovie.watchComedy();

        // var airplane :Movie = Movie.getMovie("C", "Airplane");
        // airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object unknownObject = Movie.getMovie("S", "Airplane");

        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
            // instanceof let you test the type of an instance or Object
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
            // if the instaceof method returns true the varible syfy is typed ScienceFiction
            // and behind is the Object of unkownObject
        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }
    }
}
