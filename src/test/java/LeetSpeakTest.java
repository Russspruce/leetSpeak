import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
public class LeetSpeakTest {

  // @Test
  // public void leetspeak_returnString_wordChanges(){
  //   LeetSpeak leetSpeak = new LeetSpeak();
  //   assertEquals("happy", leetSpeak.LeetStringArray("happy"));
  // }


  @Test
  public void leetspeak_replacesEveryEInAStringWithA3_wordChanges() {
    LeetSpeak leetSpeak = new LeetSpeak();
    assertEquals("3l3phant", leetSpeak.LeetStringArray("elephant"));
  }

  // @Test
  // public void leetspeak_replacesEveryOInAStringWithA0_wordChanges() {
  //   leetSpeak yourApp = new leetSpeak();
  //   assertEquals("b00 b00", yourApp.leetspeak("boo boo"));
  // }
  //
  // @Test
  // public void leetspeak_replacesEveryIInAStringWithA1_wordChanges() {
  //   leetSpeak yourApp = new leetSpeak();
  //   assertEquals("1 lik3 1k3", yourApp.leetspeak("I like Ike"));
  // }
  //
  // @Test
  // public void leetspeak_replacesEverySInAStringWithAZ_wordChanges() {
  //   leetSpeak yourApp = new leetSpeak();
  //   assertEquals("roz3z ar3 r3d", yourApp.leetspeak("roses are red"));
  // }
  //
  // @Test
  // public void leetspeak_doesNotReplaceSWhenFirstLetter_wordChanges() {
  //   leetSpeak yourApp = new leetSpeak();
  //   assertEquals("Suzi3 Sunzhin3", yourApp.leetspeak("Susie Sunshine"));
  // }
  //
  // @Test
  // public void leetspeak_makesCorrectReplacementsRegardlessOfCase_ignoresUppercase() {
  //   leetSpeak yourApp = new leetSpeak();
  //   assertEquals( "1 scr3am y0u scr3am w3 all scr3am f0r razpb3rry ic3 cr3am!", yourApp.leetspeak("I scream you scream we all scream for raspberry ice cream!"));
  // }
}
