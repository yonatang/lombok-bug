package bar;

import static foo.Foo.builder; // <-- remove this and it will compile
public class Bar {

  public static void main(String[] args) {
    var fooObject =
        foo.Foo.builder()
            .foo1("foo1").foo2("foo2").build();
    System.out.println(fooObject);
  }
}
