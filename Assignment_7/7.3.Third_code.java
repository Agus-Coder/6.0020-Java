public class Third_code extends Exception {
    // do something
    public Object get(int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= size()) { // size function not implemented
            throw new ArrayIndexOutOfBoundsException("" + index);
        }
    }

    public void main(String[] arguments) {

        try {
            get(-1);
        } catch (ArrayIndexOutOfBoundsException err) {
            System.out.println("Great, we made a mistaje " + err);
        }

    }

}
