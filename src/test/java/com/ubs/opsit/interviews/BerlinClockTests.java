package java.com.ubs.opsit.interviews;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BerlinClockTests {


    BerlinClock underTest=new BerlinClock();

    @Test
    public void shouldBlinkSecondLamp(){
        String seconds=underTest.updateSecondTime("2");
        assertThat("Y",is( seconds));

    }

    @Test
    public void shouldBlinkHoursLamp() {
        String topBottomBlink[]=underTest.updateHoursLamps("13");
        assertThat("RROO",is(topBottomBlink[0]));
        assertThat("RRRO",is(topBottomBlink[1]));
    }

    @Test
    public void shouldBlinkMinutesLamp() {
        String topBottomBlink[]=underTest.updateMinutesLamps("38");
        assertThat("YYRYYRYOOOO",is(topBottomBlink[0]));
        assertThat("YYYO",is(topBottomBlink[1]));
    }

    @Test
    public void shouldDisplayBerlinMidNight(){ō
        String[] expected = new String[] {"Y", "OOOO", "OOOO", "OOOOOOOOOOO", "OOOO"};
        String berlinTimeDisplay[]=underTest.displayBerlinTime("00:00:00");
        for (int index = 0; index < expected.length; index++) {
            assertThat(expected[index], is(berlinTimeDisplay[index]));
        }

    }

    @Test
    public void shouldDisplayBerlinMidAfterNoon(){
        String[] expected = new String[] {"O", "RROO", "RRRO", "YYROOOOOOOO", "YYOO"};
        String berlinTimeDisplay[]=underTest.displayBerlinTime("13:17:01");
        for (int index = 0; index < expected.length; index++) {
            assertThat(expected[index], is(berlinTimeDisplay[index]));
        }

    }

    @Test
    public void shouldDisplayBerlinJustBeforeMidNight(){
        String[] expected = new String[] {"O", "RRRR", "RRRO", "YYRYYRYYRYY", "YYYY"};
        String berlinTimeDisplay[]=underTest.displayBerlinTime("23:59:59");
        for (int index = 0; index < expected.length; index++) {
            assertThat(expected[index], is(berlinTimeDisplay[index]));
        }
    }
    @Test
    public void shouldDisplayBerlinMidNightLast(){
        String[] expected = new String[] {"Y", "RRRR", "RRRR", "OOOOOOOOOOO", "OOOO"};
        String berlinTimeDisplay[]=underTest.displayBerlinTime("24:00:00");
        for (int index = 0; index < expected.length; index++) {
            assertThat(expected[index], is(berlinTimeDisplay[index]));
        }
    }
}
