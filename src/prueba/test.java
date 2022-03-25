package prueba;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * TODO mgarci23 This type ...
 *
 */
public class test {

  /**
   * @param args
   */

  @Test
  public void demonstrate() {

    Person señor = new Person(45);

    assertEquals("hola", señor.decirHola());
    assertEquals(45, señor.getAge());
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    System.out.println("hello world");
  }

}
