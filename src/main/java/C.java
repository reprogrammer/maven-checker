/*>>>
import checkers.nullness.quals.*;
*/

public class C {
  public String m() {
    /*@NonNull*/ String foo = "foo";
    String bar = null;

    foo = bar;
    bar = foo;
    return foo;
  }
}

