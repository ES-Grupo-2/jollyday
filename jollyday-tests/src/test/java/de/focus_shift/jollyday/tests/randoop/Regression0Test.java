package de.focus_shift.jollyday.tests.randoop;

import de.focus_shift.jollyday.core.HolidayCalendar;
import de.focus_shift.jollyday.core.HolidayType;
import de.focus_shift.jollyday.core.spi.*;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression0Test {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        de.focus_shift.jollyday.core.spi.EthiopianOrthodoxHolidayConfiguration.EthiopianOrthodoxHolidayType ethiopianOrthodoxHolidayType0 = de.focus_shift.jollyday.core.spi.EthiopianOrthodoxHolidayConfiguration.EthiopianOrthodoxHolidayType.TIMKAT;
      Assert.assertEquals("'" + ethiopianOrthodoxHolidayType0 + "' != '" + EthiopianOrthodoxHolidayConfiguration.EthiopianOrthodoxHolidayType.TIMKAT + "'", ethiopianOrthodoxHolidayType0, EthiopianOrthodoxHolidayConfiguration.EthiopianOrthodoxHolidayType.TIMKAT);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.AUSTRIA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.AUSTRIA + "'", holidayCalendar0, HolidayCalendar.AUSTRIA);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.LESOTHO;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.LESOTHO + "'", holidayCalendar0, HolidayCalendar.LESOTHO);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        de.focus_shift.jollyday.core.parser.impl.RelativeToWeekdayInMonthParser relativeToWeekdayInMonthParser0 = new de.focus_shift.jollyday.core.parser.impl.RelativeToWeekdayInMonthParser();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.URUGUAY;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.URUGUAY + "'", holidayCalendar0, HolidayCalendar.URUGUAY);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.MEXICO;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.MEXICO + "'", holidayCalendar0, HolidayCalendar.MEXICO);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.GUINEA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.GUINEA + "'", holidayCalendar0, HolidayCalendar.GUINEA);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        de.focus_shift.jollyday.core.spi.Limited.YearCycle yearCycle0 = de.focus_shift.jollyday.core.spi.Limited.YearCycle.THREE_YEARS;
      Assert.assertEquals("'" + yearCycle0 + "' != '" + Limited.YearCycle.THREE_YEARS + "'", yearCycle0, Limited.YearCycle.THREE_YEARS);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        de.focus_shift.jollyday.core.spi.Limited.YearCycle yearCycle0 = de.focus_shift.jollyday.core.spi.Limited.YearCycle.TWO_YEARS;
      Assert.assertEquals("'" + yearCycle0 + "' != '" + Limited.YearCycle.TWO_YEARS + "'", yearCycle0, Limited.YearCycle.TWO_YEARS);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.ALGERIA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.ALGERIA + "'", holidayCalendar0, HolidayCalendar.ALGERIA);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        de.focus_shift.jollyday.core.spi.IslamicHolidayConfiguration.IslamicHolidayType islamicHolidayType0 = de.focus_shift.jollyday.core.spi.IslamicHolidayConfiguration.IslamicHolidayType.ID_UL_ADHA;
      Assert.assertEquals("'" + islamicHolidayType0 + "' != '" + IslamicHolidayConfiguration.IslamicHolidayType.ID_UL_ADHA + "'", islamicHolidayType0, IslamicHolidayConfiguration.IslamicHolidayType.ID_UL_ADHA);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.BARBADOS;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.BARBADOS + "'", holidayCalendar0, HolidayCalendar.BARBADOS);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.LIECHTENSTEIN;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.LIECHTENSTEIN + "'", holidayCalendar0, HolidayCalendar.LIECHTENSTEIN);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.LIBYA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.LIBYA + "'", holidayCalendar0, HolidayCalendar.LIBYA);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.UNITED_KINGDOM;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.UNITED_KINGDOM + "'", holidayCalendar0, HolidayCalendar.UNITED_KINGDOM);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.BELARUS;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.BELARUS + "'", holidayCalendar0, HolidayCalendar.BELARUS);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.MAURITANIA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.MAURITANIA + "'", holidayCalendar0, HolidayCalendar.MAURITANIA);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        de.focus_shift.jollyday.core.HolidayManager.setManagerCachingEnabled(false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType christianHolidayType0 = de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType.GENERAL_PRAYER_DAY;
      Assert.assertEquals("'" + christianHolidayType0 + "' != '" + ChristianHolidayConfiguration.ChristianHolidayType.GENERAL_PRAYER_DAY + "'", christianHolidayType0, ChristianHolidayConfiguration.ChristianHolidayType.GENERAL_PRAYER_DAY);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.RUSSIA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.RUSSIA + "'", holidayCalendar0, HolidayCalendar.RUSSIA);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.SINGAPORE;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.SINGAPORE + "'", holidayCalendar0, HolidayCalendar.SINGAPORE);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        de.focus_shift.jollyday.core.spi.Limited.YearCycle yearCycle0 = de.focus_shift.jollyday.core.spi.Limited.YearCycle.FOUR_YEARS;
      Assert.assertEquals("'" + yearCycle0 + "' != '" + Limited.YearCycle.FOUR_YEARS + "'", yearCycle0, Limited.YearCycle.FOUR_YEARS);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.EL_SALVADOR;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.EL_SALVADOR + "'", holidayCalendar0, HolidayCalendar.EL_SALVADOR);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.BOSNIA_HERZIGOWINA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.BOSNIA_HERZIGOWINA + "'", holidayCalendar0, HolidayCalendar.BOSNIA_HERZIGOWINA);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.KOSOVO;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.KOSOVO + "'", holidayCalendar0, HolidayCalendar.KOSOVO);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.ZAMBIA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.ZAMBIA + "'", holidayCalendar0, HolidayCalendar.ZAMBIA);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.FALKLAND_ISLANDS;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.FALKLAND_ISLANDS + "'", holidayCalendar0, HolidayCalendar.FALKLAND_ISLANDS);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.SAN_MARINO;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.SAN_MARINO + "'", holidayCalendar0, HolidayCalendar.SAN_MARINO);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        de.focus_shift.jollyday.core.spi.Limited.YearCycle yearCycle0 = de.focus_shift.jollyday.core.spi.Limited.YearCycle.FIVE_YEARS;
      Assert.assertEquals("'" + yearCycle0 + "' != '" + Limited.YearCycle.FIVE_YEARS + "'", yearCycle0, Limited.YearCycle.FIVE_YEARS);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        de.focus_shift.jollyday.core.spi.IslamicHolidayConfiguration.IslamicHolidayType islamicHolidayType0 = de.focus_shift.jollyday.core.spi.IslamicHolidayConfiguration.IslamicHolidayType.ID_AL_FITR;
      Assert.assertEquals("'" + islamicHolidayType0 + "' != '" + IslamicHolidayConfiguration.IslamicHolidayType.ID_AL_FITR + "'", islamicHolidayType0, IslamicHolidayConfiguration.IslamicHolidayType.ID_AL_FITR);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        de.focus_shift.jollyday.core.parser.impl.ChristianHolidayParser christianHolidayParser0 = new de.focus_shift.jollyday.core.parser.impl.ChristianHolidayParser();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.NYSE;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.NYSE + "'", holidayCalendar0, HolidayCalendar.NYSE);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.GREECE;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.GREECE + "'", holidayCalendar0, HolidayCalendar.GREECE);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.PARAGUAY;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.PARAGUAY + "'", holidayCalendar0, HolidayCalendar.PARAGUAY);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.SEYCHELLES;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.SEYCHELLES + "'", holidayCalendar0, HolidayCalendar.SEYCHELLES);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType christianHolidayType0 = de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType.CORPUS_CHRISTI;
      Assert.assertEquals("'" + christianHolidayType0 + "' != '" + ChristianHolidayConfiguration.ChristianHolidayType.CORPUS_CHRISTI + "'", christianHolidayType0, ChristianHolidayConfiguration.ChristianHolidayType.CORPUS_CHRISTI);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.CUBA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.CUBA + "'", holidayCalendar0, HolidayCalendar.CUBA);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.UGANDA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.UGANDA + "'", holidayCalendar0, HolidayCalendar.UGANDA);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        de.focus_shift.jollyday.core.parser.impl.FixedWeekdayBetweenFixedParser fixedWeekdayBetweenFixedParser0 = new de.focus_shift.jollyday.core.parser.impl.FixedWeekdayBetweenFixedParser();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.FRANCE;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.FRANCE + "'", holidayCalendar0, HolidayCalendar.FRANCE);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.CHAD;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.CHAD + "'", holidayCalendar0, HolidayCalendar.CHAD);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.LIBERIA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.LIBERIA + "'", holidayCalendar0, HolidayCalendar.LIBERIA);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.ZIMBABWE;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.ZIMBABWE + "'", holidayCalendar0, HolidayCalendar.ZIMBABWE);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType christianHolidayType0 = de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType.SHROVE_MONDAY;
      Assert.assertEquals("'" + christianHolidayType0 + "' != '" + ChristianHolidayConfiguration.ChristianHolidayType.SHROVE_MONDAY + "'", christianHolidayType0, ChristianHolidayConfiguration.ChristianHolidayType.SHROVE_MONDAY);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.String str0 = de.focus_shift.jollyday.core.util.ResourceUtil.UNDEFINED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "undefined" + "'", str0, "undefined");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.time.LocalDate localDate0 = null;
        de.focus_shift.jollyday.core.parser.functions.CreateHoliday createHoliday1 = new de.focus_shift.jollyday.core.parser.functions.CreateHoliday(localDate0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.SWITZERLAND;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.SWITZERLAND + "'", holidayCalendar0, HolidayCalendar.SWITZERLAND);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        de.focus_shift.jollyday.core.spi.Relation relation0 = de.focus_shift.jollyday.core.spi.Relation.CLOSEST;
      Assert.assertEquals("'" + relation0 + "' != '" + Relation.CLOSEST + "'", relation0, Relation.CLOSEST);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.TRINIDAD_AND_TOBAGO;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.TRINIDAD_AND_TOBAGO + "'", holidayCalendar0, HolidayCalendar.TRINIDAD_AND_TOBAGO);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.ALBANIA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.ALBANIA + "'", holidayCalendar0, HolidayCalendar.ALBANIA);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.LITHUANIA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.LITHUANIA + "'", holidayCalendar0, HolidayCalendar.LITHUANIA);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("", properties1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = calendarPartManagerParameter2.getManagerImplClassName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Missing configuration 'manager.impl'. Cannot create manager.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.String str0 = "";
        java.lang.String str1 = de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter.getConfigurationFileName(str0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "holidays/Holidays_.xml" + "'", str1, "holidays/Holidays_.xml");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.NEW_ZEALAND;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.NEW_ZEALAND + "'", holidayCalendar0, HolidayCalendar.NEW_ZEALAND);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.KYRGYZSTAN;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.KYRGYZSTAN + "'", holidayCalendar0, HolidayCalendar.KYRGYZSTAN);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.TANZANIA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.TANZANIA + "'", holidayCalendar0, HolidayCalendar.TANZANIA);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.COSTA_RICA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.COSTA_RICA + "'", holidayCalendar0, HolidayCalendar.COSTA_RICA);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("", properties1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = calendarPartManagerParameter2.getManagerImplClassName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Missing configuration 'manager.impl'. Cannot create manager.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.time.LocalDate localDate0 = null;
        de.focus_shift.jollyday.core.parser.functions.FindWeekDayRelativeToDate findWeekDayRelativeToDate1 = new de.focus_shift.jollyday.core.parser.functions.FindWeekDayRelativeToDate(localDate0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.HAITI;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.HAITI + "'", holidayCalendar0, HolidayCalendar.HAITI);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.ARGENTINA;
        java.lang.String str1 = holidayCalendar0.getId();
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.ARGENTINA + "'", holidayCalendar0, HolidayCalendar.ARGENTINA);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AR" + "'", str1, "AR");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        de.focus_shift.jollyday.core.spi.IslamicHolidayConfiguration.IslamicHolidayType islamicHolidayType0 = de.focus_shift.jollyday.core.spi.IslamicHolidayConfiguration.IslamicHolidayType.RAMADAN;
      Assert.assertEquals("'" + islamicHolidayType0 + "' != '" + IslamicHolidayConfiguration.IslamicHolidayType.RAMADAN + "'", islamicHolidayType0, IslamicHolidayConfiguration.IslamicHolidayType.RAMADAN);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.BAHAMAS;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.BAHAMAS + "'", holidayCalendar0, HolidayCalendar.BAHAMAS);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.String str0 = de.focus_shift.jollyday.core.ManagerParameter.MANAGER_IMPL_CLASS_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "manager.impl" + "'", str0, "manager.impl");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        de.focus_shift.jollyday.core.parser.impl.RelativeToFixedParser relativeToFixedParser0 = new de.focus_shift.jollyday.core.parser.impl.RelativeToFixedParser();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.HUNGARY;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.HUNGARY + "'", holidayCalendar0, HolidayCalendar.HUNGARY);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.ECUADOR;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.ECUADOR + "'", holidayCalendar0, HolidayCalendar.ECUADOR);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType christianHolidayType0 = de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType.EASTER;
      Assert.assertEquals("'" + christianHolidayType0 + "' != '" + ChristianHolidayConfiguration.ChristianHolidayType.EASTER + "'", christianHolidayType0, ChristianHolidayConfiguration.ChristianHolidayType.EASTER);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("", properties1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = calendarPartManagerParameter2.getConfigurationServiceImplClassName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Missing configuration 'configuration.service.impl'. Cannot create configuration service.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        de.focus_shift.jollyday.core.spi.IslamicHolidayConfiguration.IslamicHolidayType islamicHolidayType0 = de.focus_shift.jollyday.core.spi.IslamicHolidayConfiguration.IslamicHolidayType.ASCHURA;
      Assert.assertEquals("'" + islamicHolidayType0 + "' != '" + IslamicHolidayConfiguration.IslamicHolidayType.ASCHURA + "'", islamicHolidayType0, IslamicHolidayConfiguration.IslamicHolidayType.ASCHURA);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.UZBEKISTAN;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.UZBEKISTAN + "'", holidayCalendar0, HolidayCalendar.UZBEKISTAN);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType christianHolidayType0 = de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType.MARDI_GRAS;
      Assert.assertEquals("'" + christianHolidayType0 + "' != '" + ChristianHolidayConfiguration.ChristianHolidayType.MARDI_GRAS + "'", christianHolidayType0, ChristianHolidayConfiguration.ChristianHolidayType.MARDI_GRAS);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.FAROE_ISLANDS;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.FAROE_ISLANDS + "'", holidayCalendar0, HolidayCalendar.FAROE_ISLANDS);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        boolean boolean0 = de.focus_shift.jollyday.core.HolidayManager.isManagerCachingEnabled();
      Assert.assertEquals("'" + boolean0 + "' != '" + false + "'", false, boolean0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        de.focus_shift.jollyday.core.parser.impl.EthiopianOrthodoxHolidayParser ethiopianOrthodoxHolidayParser0 = new de.focus_shift.jollyday.core.parser.impl.EthiopianOrthodoxHolidayParser();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.AUSTRALIA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.AUSTRALIA + "'", holidayCalendar0, HolidayCalendar.AUSTRALIA);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.HONDURAS;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.HONDURAS + "'", holidayCalendar0, HolidayCalendar.HONDURAS);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        de.focus_shift.jollyday.core.parser.functions.CalendarToLocalDate calendarToLocalDate0 = new de.focus_shift.jollyday.core.parser.functions.CalendarToLocalDate();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        de.focus_shift.jollyday.core.parser.impl.FixedWeekdayRelativeToFixedParser fixedWeekdayRelativeToFixedParser0 = new de.focus_shift.jollyday.core.parser.impl.FixedWeekdayRelativeToFixedParser();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.PANAMA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.PANAMA + "'", holidayCalendar0, HolidayCalendar.PANAMA);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.KENYA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.KENYA + "'", holidayCalendar0, HolidayCalendar.KENYA);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.util.Set<java.lang.String> strSet0 = de.focus_shift.jollyday.core.HolidayCalendar.getSupportedCalendarCodes();
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.ERITREA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.ERITREA + "'", holidayCalendar0, HolidayCalendar.ERITREA);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("", properties1);
        calendarPartManagerParameter2.setProperty("undefined", "AR");
        // The following exception was thrown during execution in test generation
        try {
            de.focus_shift.jollyday.core.HolidayManager holidayManager6 = de.focus_shift.jollyday.core.HolidayManager.getInstance((de.focus_shift.jollyday.core.ManagerParameter) calendarPartManagerParameter2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot instantiate datasource instance because there is no implementations");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.Class<de.focus_shift.jollyday.core.ManagerParameter> managerParameterClass0 = null;
        de.focus_shift.jollyday.core.support.LazyServiceLoaderCache<de.focus_shift.jollyday.core.ManagerParameter> managerParameterLazyServiceLoaderCache1 = new de.focus_shift.jollyday.core.support.LazyServiceLoaderCache<de.focus_shift.jollyday.core.ManagerParameter>(managerParameterClass0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<de.focus_shift.jollyday.core.ManagerParameter> managerParameterList2 = managerParameterLazyServiceLoaderCache1.getServices();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.String str0 = de.focus_shift.jollyday.core.ManagerParameter.CONFIGURATION_SERVICE_IMPL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "configuration.service.impl" + "'", str0, "configuration.service.impl");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.GUATEMALA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.GUATEMALA + "'", holidayCalendar0, HolidayCalendar.GUATEMALA);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        de.focus_shift.jollyday.core.spi.IslamicHolidayConfiguration.IslamicHolidayType islamicHolidayType0 = de.focus_shift.jollyday.core.spi.IslamicHolidayConfiguration.IslamicHolidayType.LAILAT_AL_MIRAJ;
      Assert.assertEquals("'" + islamicHolidayType0 + "' != '" + IslamicHolidayConfiguration.IslamicHolidayType.LAILAT_AL_MIRAJ + "'", islamicHolidayType0, IslamicHolidayConfiguration.IslamicHolidayType.LAILAT_AL_MIRAJ);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.UKRAINE;
        java.lang.String str1 = holidayCalendar0.getId();
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.UKRAINE + "'", holidayCalendar0, HolidayCalendar.UKRAINE);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UA" + "'", str1, "UA");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType christianHolidayType0 = de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType.PALM_SUNDAY;
      Assert.assertEquals("'" + christianHolidayType0 + "' != '" + ChristianHolidayConfiguration.ChristianHolidayType.PALM_SUNDAY + "'", christianHolidayType0, ChristianHolidayConfiguration.ChristianHolidayType.PALM_SUNDAY);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.CAPE_VERDE;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.CAPE_VERDE + "'", holidayCalendar0, HolidayCalendar.CAPE_VERDE);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.time.Year year0 = null;
        de.focus_shift.jollyday.core.parser.functions.FixedToLocalDate fixedToLocalDate1 = new de.focus_shift.jollyday.core.parser.functions.FixedToLocalDate(year0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.NETHERLANDS;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.NETHERLANDS + "'", holidayCalendar0, HolidayCalendar.NETHERLANDS);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.String str0 = "AR";
        boolean boolean1 = false;
        java.util.Optional<java.net.URL> uRLOptional2 = de.focus_shift.jollyday.core.util.ResourceUtil.getResource(str0, boolean1);
        org.junit.Assert.assertNotNull(uRLOptional2);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType christianHolidayType0 = de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType.EASTER_SATURDAY;
      Assert.assertEquals("'" + christianHolidayType0 + "' != '" + ChristianHolidayConfiguration.ChristianHolidayType.EASTER_SATURDAY + "'", christianHolidayType0, ChristianHolidayConfiguration.ChristianHolidayType.EASTER_SATURDAY);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        de.focus_shift.jollyday.core.HolidayManager.clearManagerCache();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.GABON;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.GABON + "'", holidayCalendar0, HolidayCalendar.GABON);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.MALAWI;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.MALAWI + "'", holidayCalendar0, HolidayCalendar.MALAWI);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType christianHolidayType0 = de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType.WHIT_SUNDAY;
      Assert.assertEquals("'" + christianHolidayType0 + "' != '" + ChristianHolidayConfiguration.ChristianHolidayType.WHIT_SUNDAY + "'", christianHolidayType0, ChristianHolidayConfiguration.ChristianHolidayType.WHIT_SUNDAY);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        de.focus_shift.jollyday.core.parser.functions.CalculateGregorianEasterSunday calculateGregorianEasterSunday0 = new de.focus_shift.jollyday.core.parser.functions.CalculateGregorianEasterSunday();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.ESTONIA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.ESTONIA + "'", holidayCalendar0, HolidayCalendar.ESTONIA);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.ANDORRA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.ANDORRA + "'", holidayCalendar0, HolidayCalendar.ANDORRA);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.SIERRA_LEONE;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.SIERRA_LEONE + "'", holidayCalendar0, HolidayCalendar.SIERRA_LEONE);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        de.focus_shift.jollyday.core.spi.IslamicHolidayConfiguration.IslamicHolidayType islamicHolidayType0 = de.focus_shift.jollyday.core.spi.IslamicHolidayConfiguration.IslamicHolidayType.ID_AL_FITR_3;
      Assert.assertEquals("'" + islamicHolidayType0 + "' != '" + IslamicHolidayConfiguration.IslamicHolidayType.ID_AL_FITR_3 + "'", islamicHolidayType0, IslamicHolidayConfiguration.IslamicHolidayType.ID_AL_FITR_3);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        de.focus_shift.jollyday.core.spi.EthiopianOrthodoxHolidayConfiguration.EthiopianOrthodoxHolidayType ethiopianOrthodoxHolidayType0 = de.focus_shift.jollyday.core.spi.EthiopianOrthodoxHolidayConfiguration.EthiopianOrthodoxHolidayType.ENKUTATASH;
      Assert.assertEquals("'" + ethiopianOrthodoxHolidayType0 + "' != '" + EthiopianOrthodoxHolidayConfiguration.EthiopianOrthodoxHolidayType.ENKUTATASH + "'", ethiopianOrthodoxHolidayType0, EthiopianOrthodoxHolidayConfiguration.EthiopianOrthodoxHolidayType.ENKUTATASH);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType christianHolidayType0 = de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType.WHIT_MONDAY;
      Assert.assertEquals("'" + christianHolidayType0 + "' != '" + ChristianHolidayConfiguration.ChristianHolidayType.WHIT_MONDAY + "'", christianHolidayType0, ChristianHolidayConfiguration.ChristianHolidayType.WHIT_MONDAY);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        de.focus_shift.jollyday.core.spi.Movable.MovingCondition.With with0 = de.focus_shift.jollyday.core.spi.Movable.MovingCondition.With.NEXT;
      Assert.assertEquals("'" + with0 + "' != '" + Movable.MovingCondition.With.NEXT + "'", with0, Movable.MovingCondition.With.NEXT);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.BOLIVIA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.BOLIVIA + "'", holidayCalendar0, HolidayCalendar.BOLIVIA);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        de.focus_shift.jollyday.core.spi.Limited.YearCycle yearCycle0 = de.focus_shift.jollyday.core.spi.Limited.YearCycle.EVEN_YEARS;
      Assert.assertEquals("'" + yearCycle0 + "' != '" + Limited.YearCycle.EVEN_YEARS + "'", yearCycle0, Limited.YearCycle.EVEN_YEARS);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.DJIBOUTI;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.DJIBOUTI + "'", holidayCalendar0, HolidayCalendar.DJIBOUTI);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.SLOWENIA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.SLOWENIA + "'", holidayCalendar0, HolidayCalendar.SLOWENIA);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.NYSE_EURONEXT;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.NYSE_EURONEXT + "'", holidayCalendar0, HolidayCalendar.NYSE_EURONEXT);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.ISLE_OF_MAN;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.ISLE_OF_MAN + "'", holidayCalendar0, HolidayCalendar.ISLE_OF_MAN);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        de.focus_shift.jollyday.core.support.LazyServiceLoaderCache<de.focus_shift.jollyday.core.spi.HolidayCalendarConfigurationService> holidayCalendarConfigurationServiceLazyServiceLoaderCache0 = null;
        de.focus_shift.jollyday.core.datasource.ConfigurationServiceManager configurationServiceManager1 = new de.focus_shift.jollyday.core.datasource.ConfigurationServiceManager(holidayCalendarConfigurationServiceLazyServiceLoaderCache0);
        // The following exception was thrown during execution in test generation
        try {
            de.focus_shift.jollyday.core.spi.HolidayCalendarConfigurationService holidayCalendarConfigurationService3 = configurationServiceManager1.getConfigurationService("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"de.focus_shift.jollyday.core.support.LazyServiceLoaderCache.getServices()\" because \"this.configurationServiceCache\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("", properties1);
        calendarPartManagerParameter2.setProperty("undefined", "AR");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = calendarPartManagerParameter2.getManagerImplClassName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Missing configuration 'manager.impl'. Cannot create manager.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.LATVIA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.LATVIA + "'", holidayCalendar0, HolidayCalendar.LATVIA);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        de.focus_shift.jollyday.core.spi.IslamicHolidayConfiguration.IslamicHolidayType islamicHolidayType0 = de.focus_shift.jollyday.core.spi.IslamicHolidayConfiguration.IslamicHolidayType.ID_UL_ADHA_2;
      Assert.assertEquals("'" + islamicHolidayType0 + "' != '" + IslamicHolidayConfiguration.IslamicHolidayType.ID_UL_ADHA_2 + "'", islamicHolidayType0, IslamicHolidayConfiguration.IslamicHolidayType.ID_UL_ADHA_2);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.net.URL uRL0 = null;
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.UrlManagerParameter urlManagerParameter2 = new de.focus_shift.jollyday.core.parameter.UrlManagerParameter(uRL0, properties1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = urlManagerParameter2.getConfigurationServiceImplClassName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Missing configuration 'configuration.service.impl'. Cannot create configuration service.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType christianHolidayType0 = de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType.PENTECOST;
      Assert.assertEquals("'" + christianHolidayType0 + "' != '" + ChristianHolidayConfiguration.ChristianHolidayType.PENTECOST + "'", christianHolidayType0, ChristianHolidayConfiguration.ChristianHolidayType.PENTECOST);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.DOW_JONES_STOXX;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.DOW_JONES_STOXX + "'", holidayCalendar0, HolidayCalendar.DOW_JONES_STOXX);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.TAJIKISTAN;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.TAJIKISTAN + "'", holidayCalendar0, HolidayCalendar.TAJIKISTAN);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.GAMBIA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.GAMBIA + "'", holidayCalendar0, HolidayCalendar.GAMBIA);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.BELGIUM;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.BELGIUM + "'", holidayCalendar0, HolidayCalendar.BELGIUM);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.MALI;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.MALI + "'", holidayCalendar0, HolidayCalendar.MALI);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.SAUDI_ARABIA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.SAUDI_ARABIA + "'", holidayCalendar0, HolidayCalendar.SAUDI_ARABIA);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.SURINAME;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.SURINAME + "'", holidayCalendar0, HolidayCalendar.SURINAME);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        de.focus_shift.jollyday.core.caching.Cache<de.focus_shift.jollyday.core.datasource.ConfigurationServiceManager> configurationServiceManagerCache0 = new de.focus_shift.jollyday.core.caching.Cache<de.focus_shift.jollyday.core.datasource.ConfigurationServiceManager>();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.util.Set<java.lang.String> strSet0 = de.focus_shift.jollyday.core.HolidayManager.getSupportedCalendarCodes();
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType christianHolidayType0 = de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType.GOOD_FRIDAY;
      Assert.assertEquals("'" + christianHolidayType0 + "' != '" + ChristianHolidayConfiguration.ChristianHolidayType.GOOD_FRIDAY + "'", christianHolidayType0, ChristianHolidayConfiguration.ChristianHolidayType.GOOD_FRIDAY);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.DENMARK;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.DENMARK + "'", holidayCalendar0, HolidayCalendar.DENMARK);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType christianHolidayType0 = de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType.MAUNDY_THURSDAY;
      Assert.assertEquals("'" + christianHolidayType0 + "' != '" + ChristianHolidayConfiguration.ChristianHolidayType.MAUNDY_THURSDAY + "'", christianHolidayType0, ChristianHolidayConfiguration.ChristianHolidayType.MAUNDY_THURSDAY);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.CZECH_REPUBLIC;
        java.lang.Class<?> wildcardClass1 = holidayCalendar0.getClass();
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.CZECH_REPUBLIC + "'", holidayCalendar0, HolidayCalendar.CZECH_REPUBLIC);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType christianHolidayType0 = de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType.SACRED_HEART;
      Assert.assertEquals("'" + christianHolidayType0 + "' != '" + ChristianHolidayConfiguration.ChristianHolidayType.SACRED_HEART + "'", christianHolidayType0, ChristianHolidayConfiguration.ChristianHolidayType.SACRED_HEART);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.TURKEY;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.TURKEY + "'", holidayCalendar0, HolidayCalendar.TURKEY);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("", properties1);
        calendarPartManagerParameter2.setProperty("undefined", "AR");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = calendarPartManagerParameter2.getConfigurationServiceImplClassName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Missing configuration 'configuration.service.impl'. Cannot create configuration service.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.SOUTH_SUDAN;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.SOUTH_SUDAN + "'", holidayCalendar0, HolidayCalendar.SOUTH_SUDAN);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.CAYMAN_ISLANDS;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.CAYMAN_ISLANDS + "'", holidayCalendar0, HolidayCalendar.CAYMAN_ISLANDS);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.SPAIN;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.SPAIN + "'", holidayCalendar0, HolidayCalendar.SPAIN);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        de.focus_shift.jollyday.core.spi.Occurrence occurrence0 = de.focus_shift.jollyday.core.spi.Occurrence.FOURTH;
      Assert.assertEquals("'" + occurrence0 + "' != '" + Occurrence.FOURTH + "'", occurrence0, Occurrence.FOURTH);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.NICARAGUA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.NICARAGUA + "'", holidayCalendar0, HolidayCalendar.NICARAGUA);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.CENTRAL_AFRICAN_REPUBLIC;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.CENTRAL_AFRICAN_REPUBLIC + "'", holidayCalendar0, HolidayCalendar.CENTRAL_AFRICAN_REPUBLIC);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.GHANA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.GHANA + "'", holidayCalendar0, HolidayCalendar.GHANA);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.SWEDEN;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.SWEDEN + "'", holidayCalendar0, HolidayCalendar.SWEDEN);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.net.URL uRL0 = null;
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.UrlManagerParameter urlManagerParameter2 = new de.focus_shift.jollyday.core.parameter.UrlManagerParameter(uRL0, properties1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = urlManagerParameter2.getDisplayName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.toString()\" because \"this.calendarFileUrl\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.NORWAY;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.NORWAY + "'", holidayCalendar0, HolidayCalendar.NORWAY);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.EGYPT;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.EGYPT + "'", holidayCalendar0, HolidayCalendar.EGYPT);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        de.focus_shift.jollyday.core.spi.IslamicHolidayConfiguration.IslamicHolidayType islamicHolidayType0 = de.focus_shift.jollyday.core.spi.IslamicHolidayConfiguration.IslamicHolidayType.ID_AL_FITR_2;
      Assert.assertEquals("'" + islamicHolidayType0 + "' != '" + IslamicHolidayConfiguration.IslamicHolidayType.ID_AL_FITR_2 + "'", islamicHolidayType0, IslamicHolidayConfiguration.IslamicHolidayType.ID_AL_FITR_2);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.CONGO;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.CONGO + "'", holidayCalendar0, HolidayCalendar.CONGO);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        de.focus_shift.jollyday.core.parser.impl.FixedWeekdayInMonthParser fixedWeekdayInMonthParser0 = new de.focus_shift.jollyday.core.parser.impl.FixedWeekdayInMonthParser();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("CalendarPartManagerParameter - ", properties1);
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = calendarPartManagerParameter2.createResourceUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot find resource 'holidays/Holidays_CalendarPartManagerParameter - .xml'.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.ManagerParameter managerParameter2 = de.focus_shift.jollyday.core.ManagerParameters.create("undefined", properties1);
        java.lang.String str3 = managerParameter2.getDisplayName();
        java.lang.String str4 = managerParameter2.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = managerParameter2.getManagerImplClassName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Missing configuration 'manager.impl'. Cannot create manager.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(managerParameter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "undefined" + "'", str4, "undefined");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        de.focus_shift.jollyday.core.impl.JapaneseBridgingHolidayManager japaneseBridgingHolidayManager0 = new de.focus_shift.jollyday.core.impl.JapaneseBridgingHolidayManager();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.ANGOLA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.ANGOLA + "'", holidayCalendar0, HolidayCalendar.ANGOLA);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        de.focus_shift.jollyday.core.HolidayType holidayType0 = de.focus_shift.jollyday.core.HolidayType.OBSERVANCE;
      Assert.assertEquals("'" + holidayType0 + "' != '" + HolidayType.OBSERVANCE + "'", holidayType0, HolidayType.OBSERVANCE);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.ETHIOPIA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.ETHIOPIA + "'", holidayCalendar0, HolidayCalendar.ETHIOPIA);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType christianHolidayType0 = de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType.ASCENSION_DAY;
      Assert.assertEquals("'" + christianHolidayType0 + "' != '" + ChristianHolidayConfiguration.ChristianHolidayType.ASCENSION_DAY + "'", christianHolidayType0, ChristianHolidayConfiguration.ChristianHolidayType.ASCENSION_DAY);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.time.LocalDate localDate0 = null;
        de.focus_shift.jollyday.core.parser.functions.MoveDateRelative moveDateRelative1 = new de.focus_shift.jollyday.core.parser.functions.MoveDateRelative(localDate0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("", properties1);
        java.lang.String str3 = calendarPartManagerParameter2.createCacheKey();
        java.util.Properties properties4 = null;
        calendarPartManagerParameter2.mergeProperties(properties4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = calendarPartManagerParameter2.getParserImplClassName("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot create parsers. No parser implementation defined for class  in properties with key parser.impl.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.IRELAND;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.IRELAND + "'", holidayCalendar0, HolidayCalendar.IRELAND);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.TOGO;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.TOGO + "'", holidayCalendar0, HolidayCalendar.TOGO);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        de.focus_shift.jollyday.core.parser.impl.IslamicHolidayParser islamicHolidayParser0 = new de.focus_shift.jollyday.core.parser.impl.IslamicHolidayParser();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.ManagerParameter managerParameter2 = de.focus_shift.jollyday.core.ManagerParameters.create("undefined", properties1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = managerParameter2.getManagerImplClassName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Missing configuration 'manager.impl'. Cannot create manager.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(managerParameter2);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.SOUTH_AFRICA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.SOUTH_AFRICA + "'", holidayCalendar0, HolidayCalendar.SOUTH_AFRICA);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.MONACO;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.MONACO + "'", holidayCalendar0, HolidayCalendar.MONACO);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType christianHolidayType0 = de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType.CARNIVAL;
      Assert.assertEquals("'" + christianHolidayType0 + "' != '" + ChristianHolidayConfiguration.ChristianHolidayType.CARNIVAL + "'", christianHolidayType0, ChristianHolidayConfiguration.ChristianHolidayType.CARNIVAL);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = de.focus_shift.jollyday.core.util.ClassLoadingUtil.loadClass("holidays/Holidays_.xml");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: holidays/Holidays_.xml");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        de.focus_shift.jollyday.core.spi.Occurrence occurrence0 = de.focus_shift.jollyday.core.spi.Occurrence.SECOND;
      Assert.assertEquals("'" + occurrence0 + "' != '" + Occurrence.SECOND + "'", occurrence0, Occurrence.SECOND);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.lang.String str0 = "CalendarPartManagerParameter - ";
        java.lang.String str1 = de.focus_shift.jollyday.core.util.ResourceUtil.getHolidayDescription(str0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "undefined" + "'", str1, "undefined");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        de.focus_shift.jollyday.core.parser.impl.RelativeToEasterSundayParser relativeToEasterSundayParser0 = new de.focus_shift.jollyday.core.parser.impl.RelativeToEasterSundayParser();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.MOZAMBIQUE;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.MOZAMBIQUE + "'", holidayCalendar0, HolidayCalendar.MOZAMBIQUE);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.GIBRALTAR;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.GIBRALTAR + "'", holidayCalendar0, HolidayCalendar.GIBRALTAR);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.LONDON_METAL_EXCHANGE;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.LONDON_METAL_EXCHANGE + "'", holidayCalendar0, HolidayCalendar.LONDON_METAL_EXCHANGE);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.NIGER;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.NIGER + "'", holidayCalendar0, HolidayCalendar.NIGER);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        de.focus_shift.jollyday.core.spi.Occurrence occurrence0 = de.focus_shift.jollyday.core.spi.Occurrence.LAST;
      Assert.assertEquals("'" + occurrence0 + "' != '" + Occurrence.LAST + "'", occurrence0, Occurrence.LAST);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("", properties1);
        calendarPartManagerParameter2.setProperty("undefined", "AR");
        java.util.Properties properties6 = null;
        calendarPartManagerParameter2.mergeProperties(properties6);
        java.lang.String str8 = calendarPartManagerParameter2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL9 = calendarPartManagerParameter2.createResourceUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot find resource 'holidays/Holidays_.xml'.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CalendarPartManagerParameter - " + "'", str8, "CalendarPartManagerParameter - ");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.ANTARCTICA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.ANTARCTICA + "'", holidayCalendar0, HolidayCalendar.ANTARCTICA);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.TARGET2_SECURITIES;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.TARGET2_SECURITIES + "'", holidayCalendar0, HolidayCalendar.TARGET2_SECURITIES);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.SUDAN;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.SUDAN + "'", holidayCalendar0, HolidayCalendar.SUDAN);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.time.LocalDate localDate0 = null;
        java.time.LocalDate localDate1 = null;
        de.focus_shift.jollyday.core.parser.functions.FindWeekDayBetween findWeekDayBetween2 = new de.focus_shift.jollyday.core.parser.functions.FindWeekDayBetween(localDate0, localDate1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.RWANDA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.RWANDA + "'", holidayCalendar0, HolidayCalendar.RWANDA);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.FINLAND;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.FINLAND + "'", holidayCalendar0, HolidayCalendar.FINLAND);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("", properties1);
        calendarPartManagerParameter2.setProperty("undefined", "AR");
        java.util.Properties properties6 = null;
        calendarPartManagerParameter2.mergeProperties(properties6);
        java.lang.String str8 = calendarPartManagerParameter2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = calendarPartManagerParameter2.getManagerImplClassName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Missing configuration 'manager.impl'. Cannot create manager.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CalendarPartManagerParameter - " + "'", str8, "CalendarPartManagerParameter - ");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.CONGO_REPUBLIC;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.CONGO_REPUBLIC + "'", holidayCalendar0, HolidayCalendar.CONGO_REPUBLIC);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("", properties1);
        java.lang.String str3 = calendarPartManagerParameter2.createCacheKey();
        // The following exception was thrown during execution in test generation
        try {
            de.focus_shift.jollyday.core.HolidayManager holidayManager4 = de.focus_shift.jollyday.core.HolidayManager.getInstance((de.focus_shift.jollyday.core.ManagerParameter) calendarPartManagerParameter2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot instantiate datasource instance because there is no implementations");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.lang.String str0 = "manager.impl";
        java.lang.String str1 = de.focus_shift.jollyday.core.util.ResourceUtil.getCountryDescription(str0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "undefined" + "'", str1, "undefined");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.CYPRUS;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.CYPRUS + "'", holidayCalendar0, HolidayCalendar.CYPRUS);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.lang.String str0 = "undefined";
        java.lang.String str1 = de.focus_shift.jollyday.core.util.ResourceUtil.getCountryDescription(str0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "undefined" + "'", str1, "undefined");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("", properties1);
        java.lang.String str3 = calendarPartManagerParameter2.createCacheKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = calendarPartManagerParameter2.getParserImplClassName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot create parsers. No parser implementation defined for class hi! in properties with key parser.impl.hi!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.KAZAKHSTAN;
        java.lang.Class<?> wildcardClass1 = holidayCalendar0.getClass();
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.KAZAKHSTAN + "'", holidayCalendar0, HolidayCalendar.KAZAKHSTAN);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.VATICAN_CITY;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.VATICAN_CITY + "'", holidayCalendar0, HolidayCalendar.VATICAN_CITY);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        de.focus_shift.jollyday.core.spi.Movable.MovingCondition.With with0 = de.focus_shift.jollyday.core.spi.Movable.MovingCondition.With.PREVIOUS;
      Assert.assertEquals("'" + with0 + "' != '" + Movable.MovingCondition.With.PREVIOUS + "'", with0, Movable.MovingCondition.With.PREVIOUS);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.time.LocalDate localDate0 = null;
        java.time.LocalDate localDate1 = null;
        de.focus_shift.jollyday.core.parser.functions.CreateHoliday createHoliday2 = new de.focus_shift.jollyday.core.parser.functions.CreateHoliday(localDate0, localDate1);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.LUXEMBOURG;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.LUXEMBOURG + "'", holidayCalendar0, HolidayCalendar.LUXEMBOURG);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.GREENLAND;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.GREENLAND + "'", holidayCalendar0, HolidayCalendar.GREENLAND);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.UNITED_ARAB_EMIRATES;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.UNITED_ARAB_EMIRATES + "'", holidayCalendar0, HolidayCalendar.UNITED_ARAB_EMIRATES);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.TARGET;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.TARGET + "'", holidayCalendar0, HolidayCalendar.TARGET);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        de.focus_shift.jollyday.core.HolidayType holidayType0 = de.focus_shift.jollyday.core.HolidayType.PUBLIC_HOLIDAY;
      Assert.assertEquals("'" + holidayType0 + "' != '" + HolidayType.PUBLIC_HOLIDAY + "'", holidayType0, HolidayType.PUBLIC_HOLIDAY);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.net.URL uRL0 = null;
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.UrlManagerParameter urlManagerParameter2 = new de.focus_shift.jollyday.core.parameter.UrlManagerParameter(uRL0, properties1);
        // The following exception was thrown during execution in test generation
        try {
            de.focus_shift.jollyday.core.HolidayManager holidayManager3 = de.focus_shift.jollyday.core.HolidayManager.getInstance((de.focus_shift.jollyday.core.ManagerParameter) urlManagerParameter2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot instantiate datasource instance because there is no implementations");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType christianHolidayType0 = de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType.EASTER_TUESDAY;
      Assert.assertEquals("'" + christianHolidayType0 + "' != '" + ChristianHolidayConfiguration.ChristianHolidayType.EASTER_TUESDAY + "'", christianHolidayType0, ChristianHolidayConfiguration.ChristianHolidayType.EASTER_TUESDAY);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.lang.String str0 = de.focus_shift.jollyday.core.ManagerParameter.PARSER_IMPL_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "parser.impl." + "'", str0, "parser.impl.");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.ICELAND;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.ICELAND + "'", holidayCalendar0, HolidayCalendar.ICELAND);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        de.focus_shift.jollyday.core.spi.Limited.YearCycle yearCycle0 = de.focus_shift.jollyday.core.spi.Limited.YearCycle.EVERY_YEAR;
      Assert.assertEquals("'" + yearCycle0 + "' != '" + Limited.YearCycle.EVERY_YEAR + "'", yearCycle0, Limited.YearCycle.EVERY_YEAR);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.NAMIBIA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.NAMIBIA + "'", holidayCalendar0, HolidayCalendar.NAMIBIA);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        de.focus_shift.jollyday.core.spi.Limited.YearCycle yearCycle0 = de.focus_shift.jollyday.core.spi.Limited.YearCycle.ODD_YEARS;
      Assert.assertEquals("'" + yearCycle0 + "' != '" + Limited.YearCycle.ODD_YEARS + "'", yearCycle0, Limited.YearCycle.ODD_YEARS);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType christianHolidayType0 = de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType.CLEAN_MONDAY;
      Assert.assertEquals("'" + christianHolidayType0 + "' != '" + ChristianHolidayConfiguration.ChristianHolidayType.CLEAN_MONDAY + "'", christianHolidayType0, ChristianHolidayConfiguration.ChristianHolidayType.CLEAN_MONDAY);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.JAPAN;
        java.lang.String str1 = holidayCalendar0.getId();
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.JAPAN + "'", holidayCalendar0, HolidayCalendar.JAPAN);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JP" + "'", str1, "JP");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.lang.String str0 = "manager.impl";
        java.lang.String str1 = de.focus_shift.jollyday.core.util.ResourceUtil.getHolidayDescription(str0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "undefined" + "'", str1, "undefined");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        de.focus_shift.jollyday.core.support.LazyServiceLoaderCache<de.focus_shift.jollyday.core.spi.HolidayCalendarConfigurationService> holidayCalendarConfigurationServiceLazyServiceLoaderCache0 = null;
        de.focus_shift.jollyday.core.datasource.ConfigurationServiceManager configurationServiceManager1 = new de.focus_shift.jollyday.core.datasource.ConfigurationServiceManager(holidayCalendarConfigurationServiceLazyServiceLoaderCache0);
        // The following exception was thrown during execution in test generation
        try {
            de.focus_shift.jollyday.core.spi.HolidayCalendarConfigurationService holidayCalendarConfigurationService3 = configurationServiceManager1.getConfigurationService("CalendarPartManagerParameter - ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"de.focus_shift.jollyday.core.support.LazyServiceLoaderCache.getServices()\" because \"this.configurationServiceCache\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.AFGHANISTAN;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.AFGHANISTAN + "'", holidayCalendar0, HolidayCalendar.AFGHANISTAN);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.net.URL uRL0 = null;
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.UrlManagerParameter urlManagerParameter2 = new de.focus_shift.jollyday.core.parameter.UrlManagerParameter(uRL0, properties1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = urlManagerParameter2.createCacheKey();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.toString()\" because \"this.calendarFileUrl\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        de.focus_shift.jollyday.core.spi.Limited.YearCycle yearCycle0 = de.focus_shift.jollyday.core.spi.Limited.YearCycle.SIX_YEARS;
      Assert.assertEquals("'" + yearCycle0 + "' != '" + Limited.YearCycle.SIX_YEARS + "'", yearCycle0, Limited.YearCycle.SIX_YEARS);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.POLAND;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.POLAND + "'", holidayCalendar0, HolidayCalendar.POLAND);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.ManagerParameter managerParameter2 = de.focus_shift.jollyday.core.ManagerParameters.create("configuration.service.impl", properties1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = managerParameter2.getParserImplClassName("manager.impl");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot create parsers. No parser implementation defined for class manager.impl in properties with key parser.impl.manager.impl");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(managerParameter2);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.lang.String str0 = "AR";
        java.lang.String str1 = de.focus_shift.jollyday.core.util.ResourceUtil.getHolidayDescription(str0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "undefined" + "'", str1, "undefined");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("", properties1);
        java.lang.String str3 = calendarPartManagerParameter2.createCacheKey();
        java.util.Optional<java.lang.String> strOptional5 = calendarPartManagerParameter2.getProperty("undefined");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = calendarPartManagerParameter2.getManagerImplClassName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Missing configuration 'manager.impl'. Cannot create manager.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strOptional5);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("", properties1);
        calendarPartManagerParameter2.setProperty("undefined", "AR");
        java.util.Properties properties6 = null;
        calendarPartManagerParameter2.mergeProperties(properties6);
        java.lang.String str8 = calendarPartManagerParameter2.toString();
        java.lang.String str9 = calendarPartManagerParameter2.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = calendarPartManagerParameter2.getManagerImplClassName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Missing configuration 'manager.impl'. Cannot create manager.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CalendarPartManagerParameter - " + "'", str8, "CalendarPartManagerParameter - ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        de.focus_shift.jollyday.core.HolidayType holidayType0 = de.focus_shift.jollyday.core.HolidayType.BANK_HOLIDAY;
      Assert.assertEquals("'" + holidayType0 + "' != '" + HolidayType.BANK_HOLIDAY + "'", holidayType0, HolidayType.BANK_HOLIDAY);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.ITALY;
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.ManagerParameter managerParameter2 = de.focus_shift.jollyday.core.ManagerParameters.create(holidayCalendar0, properties1);
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.ITALY + "'", holidayCalendar0, HolidayCalendar.ITALY);
        org.junit.Assert.assertNotNull(managerParameter2);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.CAMEROON;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.CAMEROON + "'", holidayCalendar0, HolidayCalendar.CAMEROON);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.GUYANA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.GUYANA + "'", holidayCalendar0, HolidayCalendar.GUYANA);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.lang.String str0 = "JP";
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.ManagerParameter managerParameter2 = de.focus_shift.jollyday.core.ManagerParameters.create(str0, properties1);
        org.junit.Assert.assertNotNull(managerParameter2);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.GERMANY;
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.ManagerParameter managerParameter2 = de.focus_shift.jollyday.core.ManagerParameters.create(holidayCalendar0, properties1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = managerParameter2.getConfigurationServiceImplClassName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Missing configuration 'configuration.service.impl'. Cannot create configuration service.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.GERMANY + "'", holidayCalendar0, HolidayCalendar.GERMANY);
        org.junit.Assert.assertNotNull(managerParameter2);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.SERBIA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.SERBIA + "'", holidayCalendar0, HolidayCalendar.SERBIA);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType christianHolidayType0 = de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType.ASH_WEDNESDAY;
      Assert.assertEquals("'" + christianHolidayType0 + "' != '" + ChristianHolidayConfiguration.ChristianHolidayType.ASH_WEDNESDAY + "'", christianHolidayType0, ChristianHolidayConfiguration.ChristianHolidayType.ASH_WEDNESDAY);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.VIETNAM;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.VIETNAM + "'", holidayCalendar0, HolidayCalendar.VIETNAM);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.MACEDONIA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.MACEDONIA + "'", holidayCalendar0, HolidayCalendar.MACEDONIA);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.GERMANY;
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.ManagerParameter managerParameter2 = de.focus_shift.jollyday.core.ManagerParameters.create(holidayCalendar0, properties1);
        java.lang.String str3 = holidayCalendar0.getId();
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.GERMANY + "'", holidayCalendar0, HolidayCalendar.GERMANY);
        org.junit.Assert.assertNotNull(managerParameter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DE" + "'", str3, "DE");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.BRITISH_VIRGIN_ISLANDS;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.BRITISH_VIRGIN_ISLANDS + "'", holidayCalendar0, HolidayCalendar.BRITISH_VIRGIN_ISLANDS);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy0 = null;
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy2 = new de.focus_shift.jollyday.core.CalendarHierarchy(calendarHierarchy0, "AR");
        calendarHierarchy2.setFallbackDescription("manager.impl");
        boolean boolean6 = calendarHierarchy2.equals((java.lang.Object) 0.0d);
        de.focus_shift.jollyday.core.spi.IslamicHolidayConfiguration.IslamicHolidayType islamicHolidayType7 = de.focus_shift.jollyday.core.spi.IslamicHolidayConfiguration.IslamicHolidayType.JUMUATUL_WIDA;
        boolean boolean8 = calendarHierarchy2.equals((java.lang.Object) islamicHolidayType7);
      Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", false, boolean6);
      Assert.assertEquals("'" + islamicHolidayType7 + "' != '" + IslamicHolidayConfiguration.IslamicHolidayType.JUMUATUL_WIDA + "'", islamicHolidayType7, IslamicHolidayConfiguration.IslamicHolidayType.JUMUATUL_WIDA);
      Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", false, boolean8);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.UNITED_STATES;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.UNITED_STATES + "'", holidayCalendar0, HolidayCalendar.UNITED_STATES);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.BURUNDI;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.BURUNDI + "'", holidayCalendar0, HolidayCalendar.BURUNDI);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        de.focus_shift.jollyday.core.spi.Relation relation0 = de.focus_shift.jollyday.core.spi.Relation.AFTER;
      Assert.assertEquals("'" + relation0 + "' != '" + Relation.AFTER + "'", relation0, Relation.AFTER);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("", properties1);
        java.lang.String str3 = calendarPartManagerParameter2.createCacheKey();
        java.util.Optional<java.lang.String> strOptional5 = calendarPartManagerParameter2.getProperty("undefined");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = calendarPartManagerParameter2.getParserImplClassName("Argentina");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot create parsers. No parser implementation defined for class Argentina in properties with key parser.impl.Argentina");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strOptional5);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        de.focus_shift.jollyday.core.spi.EthiopianOrthodoxHolidayConfiguration.EthiopianOrthodoxHolidayType ethiopianOrthodoxHolidayType0 = de.focus_shift.jollyday.core.spi.EthiopianOrthodoxHolidayConfiguration.EthiopianOrthodoxHolidayType.MESKEL;
      Assert.assertEquals("'" + ethiopianOrthodoxHolidayType0 + "' != '" + EthiopianOrthodoxHolidayConfiguration.EthiopianOrthodoxHolidayType.MESKEL + "'", ethiopianOrthodoxHolidayType0, EthiopianOrthodoxHolidayConfiguration.EthiopianOrthodoxHolidayType.MESKEL);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.lang.String str0 = "UA";
        boolean boolean1 = false;
        java.util.Optional<java.net.URL> uRLOptional2 = de.focus_shift.jollyday.core.util.ResourceUtil.getResource(str0, boolean1);
        org.junit.Assert.assertNotNull(uRLOptional2);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.TURKMENISTAN;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.TURKMENISTAN + "'", holidayCalendar0, HolidayCalendar.TURKMENISTAN);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.TUNISIA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.TUNISIA + "'", holidayCalendar0, HolidayCalendar.TUNISIA);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        de.focus_shift.jollyday.core.spi.IslamicHolidayConfiguration.IslamicHolidayType islamicHolidayType0 = de.focus_shift.jollyday.core.spi.IslamicHolidayConfiguration.IslamicHolidayType.MAWLID_AN_NABI;
      Assert.assertEquals("'" + islamicHolidayType0 + "' != '" + IslamicHolidayConfiguration.IslamicHolidayType.MAWLID_AN_NABI + "'", islamicHolidayType0, IslamicHolidayConfiguration.IslamicHolidayType.MAWLID_AN_NABI);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.lang.String str0 = "DE";
        boolean boolean1 = true;
        java.util.Optional<java.net.URL> uRLOptional2 = de.focus_shift.jollyday.core.util.ResourceUtil.getResource(str0, boolean1);
        org.junit.Assert.assertNotNull(uRLOptional2);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.lang.String str0 = "parser.impl.";
        boolean boolean1 = true;
        java.util.Optional<java.net.URL> uRLOptional2 = de.focus_shift.jollyday.core.util.ResourceUtil.getResource(str0, boolean1);
        org.junit.Assert.assertNotNull(uRLOptional2);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.ARMENIA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.ARMENIA + "'", holidayCalendar0, HolidayCalendar.ARMENIA);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.CANADA;
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.ManagerParameter managerParameter2 = de.focus_shift.jollyday.core.ManagerParameters.create(holidayCalendar0, properties1);
        de.focus_shift.jollyday.core.ManagerParameter managerParameter3 = de.focus_shift.jollyday.core.ManagerParameters.create(holidayCalendar0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = managerParameter3.getParserImplClassName("undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot create parsers. No parser implementation defined for class undefined in properties with key parser.impl.undefined");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.CANADA + "'", holidayCalendar0, HolidayCalendar.CANADA);
        org.junit.Assert.assertNotNull(managerParameter2);
        org.junit.Assert.assertNotNull(managerParameter3);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.MONTENEGRO;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.MONTENEGRO + "'", holidayCalendar0, HolidayCalendar.MONTENEGRO);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.BURKINA_FASO;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.BURKINA_FASO + "'", holidayCalendar0, HolidayCalendar.BURKINA_FASO);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.lang.String str0 = "UA";
        java.lang.String str1 = de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter.getConfigurationFileName(str0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "holidays/Holidays_UA.xml" + "'", str1, "holidays/Holidays_UA.xml");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy0 = null;
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy2 = new de.focus_shift.jollyday.core.CalendarHierarchy(calendarHierarchy0, "AR");
        calendarHierarchy2.setFallbackDescription("manager.impl");
        java.util.Map<java.lang.String, de.focus_shift.jollyday.core.CalendarHierarchy> strMap5 = null;
        calendarHierarchy2.setChildren(strMap5);
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy8 = new de.focus_shift.jollyday.core.CalendarHierarchy(calendarHierarchy2, "hi!");
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = calendarHierarchy8.getDescription(locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.BENIN;
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.ManagerParameter managerParameter2 = de.focus_shift.jollyday.core.ManagerParameters.create(holidayCalendar0, properties1);
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.BENIN + "'", holidayCalendar0, HolidayCalendar.BENIN);
        org.junit.Assert.assertNotNull(managerParameter2);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.lang.String str0 = "UA";
        java.util.Optional<java.net.URL> uRLOptional1 = de.focus_shift.jollyday.core.util.ResourceUtil.getResource(str0);
        org.junit.Assert.assertNotNull(uRLOptional1);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("", properties1);
        java.lang.String str3 = calendarPartManagerParameter2.createCacheKey();
        java.util.Properties properties4 = null;
        calendarPartManagerParameter2.mergeProperties(properties4);
        java.util.Optional<java.lang.String> strOptional7 = calendarPartManagerParameter2.getProperty("holidays/Holidays_.xml");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = calendarPartManagerParameter2.getConfigurationServiceImplClassName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Missing configuration 'configuration.service.impl'. Cannot create configuration service.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strOptional7);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.time.Year year0 = null;
        de.focus_shift.jollyday.core.parser.predicates.ValidFromTo validFromTo1 = new de.focus_shift.jollyday.core.parser.predicates.ValidFromTo(year0);
        java.util.function.Predicate<de.focus_shift.jollyday.core.spi.Limited> limitedPredicate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.function.Predicate<de.focus_shift.jollyday.core.spi.Limited> limitedPredicate3 = validFromTo1.and(limitedPredicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        de.focus_shift.jollyday.core.caching.Cache<java.lang.invoke.TypeDescriptor> typeDescriptorCache0 = new de.focus_shift.jollyday.core.caching.Cache<java.lang.invoke.TypeDescriptor>();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.PERU;
        java.lang.String str1 = holidayCalendar0.getId();
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.PERU + "'", holidayCalendar0, HolidayCalendar.PERU);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "PE" + "'", str1, "PE");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.ManagerParameter managerParameter2 = de.focus_shift.jollyday.core.ManagerParameters.create("undefined", properties1);
        java.lang.String str3 = managerParameter2.getDisplayName();
        java.lang.String str4 = managerParameter2.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            de.focus_shift.jollyday.core.HolidayManager holidayManager5 = de.focus_shift.jollyday.core.HolidayManager.getInstance(managerParameter2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot instantiate datasource instance because there is no implementations");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(managerParameter2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "undefined" + "'", str4, "undefined");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.time.Year year0 = null;
        de.focus_shift.jollyday.core.parser.functions.CalculateEasterSunday calculateEasterSunday1 = new de.focus_shift.jollyday.core.parser.functions.CalculateEasterSunday(year0);
        java.time.chrono.HijrahChronology hijrahChronology2 = de.focus_shift.jollyday.core.parser.impl.IslamicHolidayParser.HIJRAH;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate3 = calculateEasterSunday1.apply((java.time.chrono.Chronology) hijrahChronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.Year.isAfter(java.time.Year)\" because \"this.year\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hijrahChronology2);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.JERSEY;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.JERSEY + "'", holidayCalendar0, HolidayCalendar.JERSEY);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = de.focus_shift.jollyday.core.util.ClassLoadingUtil.loadClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.COLOMBIA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.COLOMBIA + "'", holidayCalendar0, HolidayCalendar.COLOMBIA);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = de.focus_shift.jollyday.core.util.ClassLoadingUtil.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.lang.String str0 = "";
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter(str0, properties1);
        java.lang.String str3 = "undefined";
        java.lang.String str4 = "AR";
        calendarPartManagerParameter2.setProperty(str3, str4);
        java.util.Properties properties6 = null;
        calendarPartManagerParameter2.mergeProperties(properties6);
        java.lang.String str8 = "DE";
        java.lang.String str9 = "JP";
        calendarPartManagerParameter2.setProperty(str8, str9);
        java.lang.String str11 = calendarPartManagerParameter2.createCacheKey();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        de.focus_shift.jollyday.core.spi.Relation relation0 = de.focus_shift.jollyday.core.spi.Relation.BEFORE;
      Assert.assertEquals("'" + relation0 + "' != '" + Relation.BEFORE + "'", relation0, Relation.BEFORE);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.lang.String str0 = "parser.impl.";
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.ManagerParameter managerParameter2 = de.focus_shift.jollyday.core.ManagerParameters.create(str0, properties1);
        org.junit.Assert.assertNotNull(managerParameter2);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        de.focus_shift.jollyday.core.caching.Cache<java.lang.constant.ConstantDesc> constantDescCache0 = new de.focus_shift.jollyday.core.caching.Cache<java.lang.constant.ConstantDesc>();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.lang.String str0 = "holidays/Holidays_.xml";
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.ManagerParameter managerParameter2 = de.focus_shift.jollyday.core.ManagerParameters.create(str0, properties1);
        org.junit.Assert.assertNotNull(managerParameter2);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy0 = null;
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy2 = new de.focus_shift.jollyday.core.CalendarHierarchy(calendarHierarchy0, "AR");
        calendarHierarchy2.setFallbackDescription("manager.impl");
        java.util.Map<java.lang.String, de.focus_shift.jollyday.core.CalendarHierarchy> strMap5 = null;
        calendarHierarchy2.setChildren(strMap5);
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy7 = null;
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy9 = new de.focus_shift.jollyday.core.CalendarHierarchy(calendarHierarchy7, "AR");
        calendarHierarchy9.setFallbackDescription("manager.impl");
        boolean boolean13 = calendarHierarchy9.equals((java.lang.Object) 0.0d);
        java.util.Map<java.lang.String, de.focus_shift.jollyday.core.CalendarHierarchy> strMap14 = calendarHierarchy9.getChildren();
        java.util.Map<java.lang.String, de.focus_shift.jollyday.core.CalendarHierarchy> strMap15 = calendarHierarchy9.getChildren();
        calendarHierarchy2.setChildren(strMap15);
      Assert.assertFalse("'" + boolean13 + "' != '" + false + "'", boolean13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy0 = null;
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy2 = new de.focus_shift.jollyday.core.CalendarHierarchy(calendarHierarchy0, "AR");
        calendarHierarchy2.setFallbackDescription("manager.impl");
        boolean boolean6 = calendarHierarchy2.equals((java.lang.Object) 0.0d);
        java.util.Map<java.lang.String, de.focus_shift.jollyday.core.CalendarHierarchy> strMap7 = null;
        calendarHierarchy2.setChildren(strMap7);
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = calendarHierarchy2.getDescription(locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
      Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", false, boolean6);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.time.Year year0 = null;
        de.focus_shift.jollyday.core.parser.functions.CalculateEasterSunday calculateEasterSunday1 = new de.focus_shift.jollyday.core.parser.functions.CalculateEasterSunday(year0);
        java.time.chrono.HijrahChronology hijrahChronology4 = de.focus_shift.jollyday.core.parser.impl.IslamicHolidayParser.HIJRAH;
        de.focus_shift.jollyday.core.parser.functions.CalculateRelativeDatesFromChronologyWithinGregorianYear calculateRelativeDatesFromChronologyWithinGregorianYear6 = new de.focus_shift.jollyday.core.parser.functions.CalculateRelativeDatesFromChronologyWithinGregorianYear((-1), 10, (java.time.chrono.Chronology) hijrahChronology4, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate7 = calculateEasterSunday1.apply((java.time.chrono.Chronology) hijrahChronology4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.Year.isAfter(java.time.Year)\" because \"this.year\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hijrahChronology4);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.lang.String str0 = "UA";
        de.focus_shift.jollyday.core.ManagerParameter managerParameter1 = de.focus_shift.jollyday.core.ManagerParameters.create(str0);
        org.junit.Assert.assertNotNull(managerParameter1);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.lang.String str0 = "AR";
        java.lang.String str1 = de.focus_shift.jollyday.core.util.ResourceUtil.getCountryDescription(str0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Argentina" + "'", str1, "Argentina");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.NIGERIA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.NIGERIA + "'", holidayCalendar0, HolidayCalendar.NIGERIA);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.BULGARIA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.BULGARIA + "'", holidayCalendar0, HolidayCalendar.BULGARIA);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        java.lang.ClassLoader classLoader0 = de.focus_shift.jollyday.core.util.ClassLoadingUtil.getClassloader();
        org.junit.Assert.assertNotNull(classLoader0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        de.focus_shift.jollyday.core.ManagerParameter managerParameter1 = de.focus_shift.jollyday.core.ManagerParameters.create("AR");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = managerParameter1.getConfigurationServiceImplClassName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Missing configuration 'configuration.service.impl'. Cannot create configuration service.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(managerParameter1);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.time.Year year0 = null;
        de.focus_shift.jollyday.core.parser.functions.CalculateEasterSunday calculateEasterSunday1 = new de.focus_shift.jollyday.core.parser.functions.CalculateEasterSunday(year0);
        java.time.chrono.HijrahChronology hijrahChronology4 = de.focus_shift.jollyday.core.parser.impl.IslamicHolidayParser.HIJRAH;
        de.focus_shift.jollyday.core.parser.functions.CalculateRelativeDatesFromChronologyWithinGregorianYear calculateRelativeDatesFromChronologyWithinGregorianYear6 = new de.focus_shift.jollyday.core.parser.functions.CalculateRelativeDatesFromChronologyWithinGregorianYear(10, 10, (java.time.chrono.Chronology) hijrahChronology4, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate7 = calculateEasterSunday1.apply((java.time.chrono.Chronology) hijrahChronology4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.Year.isAfter(java.time.Year)\" because \"this.year\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hijrahChronology4);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy0 = null;
        java.lang.String str1 = "AR";
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy2 = new de.focus_shift.jollyday.core.CalendarHierarchy(calendarHierarchy0, str1);
        java.lang.String str3 = "manager.impl";
        calendarHierarchy2.setFallbackDescription(str3);
        double double5 = 0.0d;
        boolean boolean6 = calendarHierarchy2.equals((java.lang.Object) double5);
        java.util.Map<java.lang.String, de.focus_shift.jollyday.core.CalendarHierarchy> strMap7 = calendarHierarchy2.getChildren();
        java.util.Map<java.lang.String, de.focus_shift.jollyday.core.CalendarHierarchy> strMap8 = calendarHierarchy2.getChildren();
        java.util.Map<java.lang.String, de.focus_shift.jollyday.core.CalendarHierarchy> strMap9 = calendarHierarchy2.getChildren();
      Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", false, boolean6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.lang.String str0 = "manager.impl";
        java.util.Optional<java.net.URL> uRLOptional1 = de.focus_shift.jollyday.core.util.ResourceUtil.getResource(str0);
        org.junit.Assert.assertNotNull(uRLOptional1);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        de.focus_shift.jollyday.core.configuration.ConfigurationProviderManager configurationProviderManager0 = new de.focus_shift.jollyday.core.configuration.ConfigurationProviderManager();
        java.util.Properties properties2 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter3 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("", properties2);
        calendarPartManagerParameter3.setProperty("undefined", "AR");
        java.util.Properties properties7 = null;
        calendarPartManagerParameter3.mergeProperties(properties7);
        configurationProviderManager0.mergeConfigurationProperties((de.focus_shift.jollyday.core.ManagerParameter) calendarPartManagerParameter3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = calendarPartManagerParameter3.getParserImplClassName("JP");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot create parsers. No parser implementation defined for class JP in properties with key parser.impl.JP");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("", properties1);
        java.lang.String str3 = calendarPartManagerParameter2.createCacheKey();
        java.util.Optional<java.lang.String> strOptional5 = calendarPartManagerParameter2.getProperty("undefined");
        java.util.Properties properties6 = null;
        calendarPartManagerParameter2.mergeProperties(properties6);
        calendarPartManagerParameter2.setProperty("parser.impl.", "undefined");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strOptional5);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        de.focus_shift.jollyday.core.spi.IslamicHolidayConfiguration.IslamicHolidayType islamicHolidayType0 = de.focus_shift.jollyday.core.spi.IslamicHolidayConfiguration.IslamicHolidayType.ARAFAAT;
      Assert.assertEquals("'" + islamicHolidayType0 + "' != '" + IslamicHolidayConfiguration.IslamicHolidayType.ARAFAAT + "'", islamicHolidayType0, IslamicHolidayConfiguration.IslamicHolidayType.ARAFAAT);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.lang.String str0 = "AR";
        java.lang.String str1 = de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter.getConfigurationFileName(str0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "holidays/Holidays_AR.xml" + "'", str1, "holidays/Holidays_AR.xml");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.time.Year year0 = null;
        de.focus_shift.jollyday.core.parser.predicates.ValidFromTo validFromTo1 = new de.focus_shift.jollyday.core.parser.predicates.ValidFromTo(year0);
        java.time.Year year2 = null;
        de.focus_shift.jollyday.core.parser.predicates.ValidFromTo validFromTo3 = new de.focus_shift.jollyday.core.parser.predicates.ValidFromTo(year2);
        java.util.function.Predicate<de.focus_shift.jollyday.core.spi.Limited> limitedPredicate4 = validFromTo1.or((java.util.function.Predicate<de.focus_shift.jollyday.core.spi.Limited>) validFromTo3);
        java.util.function.Predicate<de.focus_shift.jollyday.core.spi.Limited> limitedPredicate5 = validFromTo3.negate();
        java.time.Year year6 = null;
        de.focus_shift.jollyday.core.parser.predicates.ValidCycle validCycle7 = new de.focus_shift.jollyday.core.parser.predicates.ValidCycle(year6);
        java.util.function.Predicate<de.focus_shift.jollyday.core.spi.Limited> limitedPredicate8 = validFromTo3.or((java.util.function.Predicate<de.focus_shift.jollyday.core.spi.Limited>) validCycle7);
        org.junit.Assert.assertNotNull(limitedPredicate4);
        org.junit.Assert.assertNotNull(limitedPredicate5);
        org.junit.Assert.assertNotNull(limitedPredicate8);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        de.focus_shift.jollyday.core.HolidayManager.setManagerCachingEnabled(true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy0 = null;
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy2 = new de.focus_shift.jollyday.core.CalendarHierarchy(calendarHierarchy0, "AR");
        calendarHierarchy2.setFallbackDescription("manager.impl");
        boolean boolean6 = calendarHierarchy2.equals((java.lang.Object) 0.0d);
        java.util.Map<java.lang.String, de.focus_shift.jollyday.core.CalendarHierarchy> strMap7 = null;
        calendarHierarchy2.setChildren(strMap7);
        java.lang.String str9 = calendarHierarchy2.getDescription();
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = calendarHierarchy2.getDescription(locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
      Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", false, boolean6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Argentina" + "'", str9, "Argentina");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.BERMUDA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.BERMUDA + "'", holidayCalendar0, HolidayCalendar.BERMUDA);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.lang.String str0 = "CalendarPartManagerParameter - ";
        de.focus_shift.jollyday.core.ManagerParameter managerParameter1 = de.focus_shift.jollyday.core.ManagerParameters.create(str0);
        org.junit.Assert.assertNotNull(managerParameter1);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.time.LocalDate localDate0 = null;
        java.time.LocalDate localDate1 = null;
        de.focus_shift.jollyday.core.parser.functions.CreateHoliday createHoliday3 = new de.focus_shift.jollyday.core.parser.functions.CreateHoliday(localDate0, localDate1, "holidays/Holidays_AR.xml");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.MALTA;
        java.lang.String str1 = holidayCalendar0.getId();
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.MALTA + "'", holidayCalendar0, HolidayCalendar.MALTA);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MT" + "'", str1, "MT");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.lang.String str0 = "";
        java.lang.String str1 = de.focus_shift.jollyday.core.util.ResourceUtil.getCountryDescription(str0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "undefined" + "'", str1, "undefined");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.ROMANIA;
        java.lang.String str1 = holidayCalendar0.getId();
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.ROMANIA + "'", holidayCalendar0, HolidayCalendar.ROMANIA);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RO" + "'", str1, "RO");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.HONG_KONG;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.HONG_KONG + "'", holidayCalendar0, HolidayCalendar.HONG_KONG);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.MOROCCO;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.MOROCCO + "'", holidayCalendar0, HolidayCalendar.MOROCCO);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.SLOWAKIA;
        java.lang.String str1 = holidayCalendar0.getId();
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.SLOWAKIA + "'", holidayCalendar0, HolidayCalendar.SLOWAKIA);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SK" + "'", str1, "SK");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.BRAZIL;
        java.lang.String str1 = holidayCalendar0.getId();
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.BRAZIL + "'", holidayCalendar0, HolidayCalendar.BRAZIL);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "BR" + "'", str1, "BR");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        java.time.LocalDate localDate0 = null;
        de.focus_shift.jollyday.core.parser.predicates.ValidMovingCondition validMovingCondition1 = new de.focus_shift.jollyday.core.parser.predicates.ValidMovingCondition(localDate0);
        de.focus_shift.jollyday.core.spi.Movable.MovingCondition movingCondition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = validMovingCondition1.test(movingCondition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.getDayOfWeek()\" because \"this.date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = de.focus_shift.jollyday.core.util.ClassLoadingUtil.loadClass("holidays/Holidays_UA.xml");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: holidays/Holidays_UA.xml");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        java.lang.String str0 = "";
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter(str0, properties1);
        java.lang.String str3 = calendarPartManagerParameter2.toString();
        java.lang.String str4 = "UA";
        java.lang.String str5 = "undefined";
        calendarPartManagerParameter2.setProperty(str4, str5);
        java.lang.String str7 = calendarPartManagerParameter2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CalendarPartManagerParameter - " + "'", str3, "CalendarPartManagerParameter - ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CalendarPartManagerParameter - " + "'", str7, "CalendarPartManagerParameter - ");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.IVORY_COAST;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.IVORY_COAST + "'", holidayCalendar0, HolidayCalendar.IVORY_COAST);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy0 = null;
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy2 = new de.focus_shift.jollyday.core.CalendarHierarchy(calendarHierarchy0, "AR");
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy4 = new de.focus_shift.jollyday.core.CalendarHierarchy(calendarHierarchy0, "SK");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        de.focus_shift.jollyday.core.parser.impl.FixedParser fixedParser0 = new de.focus_shift.jollyday.core.parser.impl.FixedParser();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("", properties1);
        java.lang.String str3 = calendarPartManagerParameter2.createCacheKey();
        java.util.Properties properties4 = null;
        calendarPartManagerParameter2.mergeProperties(properties4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = calendarPartManagerParameter2.getManagerImplClassName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Missing configuration 'manager.impl'. Cannot create manager.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType christianHolidayType0 = de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType.EASTER_MONDAY;
      Assert.assertEquals("'" + christianHolidayType0 + "' != '" + ChristianHolidayConfiguration.ChristianHolidayType.EASTER_MONDAY + "'", christianHolidayType0, ChristianHolidayConfiguration.ChristianHolidayType.EASTER_MONDAY);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.CROATIA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.CROATIA + "'", holidayCalendar0, HolidayCalendar.CROATIA);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        de.focus_shift.jollyday.core.support.LazyServiceLoaderCache<de.focus_shift.jollyday.core.spi.HolidayCalendarConfigurationService> holidayCalendarConfigurationServiceLazyServiceLoaderCache0 = null;
        de.focus_shift.jollyday.core.datasource.ConfigurationServiceManager configurationServiceManager1 = new de.focus_shift.jollyday.core.datasource.ConfigurationServiceManager(holidayCalendarConfigurationServiceLazyServiceLoaderCache0);
        // The following exception was thrown during execution in test generation
        try {
            de.focus_shift.jollyday.core.spi.HolidayCalendarConfigurationService holidayCalendarConfigurationService3 = configurationServiceManager1.getConfigurationService("manager.impl");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"de.focus_shift.jollyday.core.support.LazyServiceLoaderCache.getServices()\" because \"this.configurationServiceCache\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        java.time.Year year0 = null;
        de.focus_shift.jollyday.core.parser.predicates.ValidFromTo validFromTo1 = new de.focus_shift.jollyday.core.parser.predicates.ValidFromTo(year0);
        java.time.Year year2 = null;
        de.focus_shift.jollyday.core.parser.predicates.ValidFromTo validFromTo3 = new de.focus_shift.jollyday.core.parser.predicates.ValidFromTo(year2);
        java.util.function.Predicate<de.focus_shift.jollyday.core.spi.Limited> limitedPredicate4 = validFromTo1.or((java.util.function.Predicate<de.focus_shift.jollyday.core.spi.Limited>) validFromTo3);
        java.time.Year year5 = null;
        de.focus_shift.jollyday.core.parser.predicates.ValidFromTo validFromTo6 = new de.focus_shift.jollyday.core.parser.predicates.ValidFromTo(year5);
        java.time.Year year7 = null;
        de.focus_shift.jollyday.core.parser.predicates.ValidFromTo validFromTo8 = new de.focus_shift.jollyday.core.parser.predicates.ValidFromTo(year7);
        java.util.function.Predicate<de.focus_shift.jollyday.core.spi.Limited> limitedPredicate9 = validFromTo6.or((java.util.function.Predicate<de.focus_shift.jollyday.core.spi.Limited>) validFromTo8);
        java.util.function.Predicate<de.focus_shift.jollyday.core.spi.Limited> limitedPredicate10 = validFromTo8.negate();
        java.util.function.Predicate<de.focus_shift.jollyday.core.spi.Limited> limitedPredicate11 = validFromTo1.or(limitedPredicate10);
        java.util.function.Predicate<de.focus_shift.jollyday.core.spi.Limited> limitedPredicate12 = validFromTo1.negate();
        org.junit.Assert.assertNotNull(limitedPredicate4);
        org.junit.Assert.assertNotNull(limitedPredicate9);
        org.junit.Assert.assertNotNull(limitedPredicate10);
        org.junit.Assert.assertNotNull(limitedPredicate11);
        org.junit.Assert.assertNotNull(limitedPredicate12);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        java.time.LocalDate localDate0 = null;
        de.focus_shift.jollyday.core.parser.predicates.ValidMovingCondition validMovingCondition1 = new de.focus_shift.jollyday.core.parser.predicates.ValidMovingCondition(localDate0);
        java.util.function.Predicate<de.focus_shift.jollyday.core.spi.Movable.MovingCondition> movingConditionPredicate2 = validMovingCondition1.negate();
        java.util.function.Predicate<de.focus_shift.jollyday.core.spi.Movable.MovingCondition> movingConditionPredicate3 = validMovingCondition1.negate();
        de.focus_shift.jollyday.core.spi.Movable.MovingCondition movingCondition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = validMovingCondition1.test(movingCondition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.getDayOfWeek()\" because \"this.date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(movingConditionPredicate2);
        org.junit.Assert.assertNotNull(movingConditionPredicate3);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("", properties1);
        java.lang.String str3 = calendarPartManagerParameter2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = calendarPartManagerParameter2.getConfigurationServiceImplClassName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Missing configuration 'configuration.service.impl'. Cannot create configuration service.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CalendarPartManagerParameter - " + "'", str3, "CalendarPartManagerParameter - ");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("", properties1);
        java.lang.String str3 = calendarPartManagerParameter2.createCacheKey();
        java.util.Optional<java.lang.String> strOptional5 = calendarPartManagerParameter2.getProperty("undefined");
        java.util.Properties properties6 = null;
        calendarPartManagerParameter2.mergeProperties(properties6);
        java.lang.String str8 = calendarPartManagerParameter2.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = calendarPartManagerParameter2.getManagerImplClassName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Missing configuration 'manager.impl'. Cannot create manager.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strOptional5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("", properties1);
        java.util.Properties properties3 = null;
        calendarPartManagerParameter2.mergeProperties(properties3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = calendarPartManagerParameter2.getParserImplClassName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot create parsers. No parser implementation defined for class hi! in properties with key parser.impl.hi!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.MAURITIUS;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.MAURITIUS + "'", holidayCalendar0, HolidayCalendar.MAURITIUS);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.MADAGASCAR;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.MADAGASCAR + "'", holidayCalendar0, HolidayCalendar.MADAGASCAR);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.BANGLADESH;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.BANGLADESH + "'", holidayCalendar0, HolidayCalendar.BANGLADESH);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        java.time.Year year0 = null;
        de.focus_shift.jollyday.core.parser.predicates.ValidLimitation validLimitation1 = new de.focus_shift.jollyday.core.parser.predicates.ValidLimitation(year0);
        java.util.function.Predicate<de.focus_shift.jollyday.core.spi.Limited> limitedPredicate2 = validLimitation1.negate();
        org.junit.Assert.assertNotNull(limitedPredicate2);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        de.focus_shift.jollyday.core.ManagerParameter managerParameter1 = de.focus_shift.jollyday.core.ManagerParameters.create("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = managerParameter1.getParserImplClassName("parser.impl.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot create parsers. No parser implementation defined for class parser.impl. in properties with key parser.impl.parser.impl.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(managerParameter1);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        java.lang.String str0 = "undefined";
        boolean boolean1 = false;
        java.util.Optional<java.net.URL> uRLOptional2 = de.focus_shift.jollyday.core.util.ResourceUtil.getResource(str0, boolean1);
        org.junit.Assert.assertNotNull(uRLOptional2);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("", properties1);
        calendarPartManagerParameter2.setProperty("undefined", "AR");
        java.util.Properties properties6 = null;
        calendarPartManagerParameter2.mergeProperties(properties6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = calendarPartManagerParameter2.getConfigurationServiceImplClassName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Missing configuration 'configuration.service.impl'. Cannot create configuration service.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy0 = null;
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy2 = new de.focus_shift.jollyday.core.CalendarHierarchy(calendarHierarchy0, "AR");
        java.lang.String str3 = calendarHierarchy2.getId();
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = calendarHierarchy2.getDescription(locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AR" + "'", str3, "AR");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        de.focus_shift.jollyday.core.ManagerParameter managerParameter1 = de.focus_shift.jollyday.core.ManagerParameters.create("holidays/Holidays_.xml");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = managerParameter1.getParserImplClassName("holidays/Holidays_AR.xml");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot create parsers. No parser implementation defined for class holidays/Holidays_AR.xml in properties with key parser.impl.holidays/Holidays_AR.xml");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(managerParameter1);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("", properties1);
        java.lang.String str3 = calendarPartManagerParameter2.createCacheKey();
        java.util.Optional<java.lang.String> strOptional5 = calendarPartManagerParameter2.getProperty("undefined");
        java.util.Properties properties6 = null;
        calendarPartManagerParameter2.mergeProperties(properties6);
        java.lang.String str8 = calendarPartManagerParameter2.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            de.focus_shift.jollyday.core.HolidayManager holidayManager9 = de.focus_shift.jollyday.core.HolidayManager.getInstance((de.focus_shift.jollyday.core.ManagerParameter) calendarPartManagerParameter2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot instantiate datasource instance because there is no implementations");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strOptional5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        de.focus_shift.jollyday.core.caching.Cache<de.focus_shift.jollyday.core.spi.Relation> relationCache0 = new de.focus_shift.jollyday.core.caching.Cache<de.focus_shift.jollyday.core.spi.Relation>();
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        de.focus_shift.jollyday.core.ManagerParameter managerParameter1 = de.focus_shift.jollyday.core.ManagerParameters.create("hi!");
        java.util.Optional<java.lang.String> strOptional3 = managerParameter1.getProperty("Argentina");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = managerParameter1.getManagerImplClassName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Missing configuration 'manager.impl'. Cannot create manager.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(managerParameter1);
        org.junit.Assert.assertNotNull(strOptional3);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.GEORGIA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.GEORGIA + "'", holidayCalendar0, HolidayCalendar.GEORGIA);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        de.focus_shift.jollyday.core.configuration.ConfigurationProviderManager configurationProviderManager0 = new de.focus_shift.jollyday.core.configuration.ConfigurationProviderManager();
        java.lang.String str1 = "";
        java.util.Properties properties2 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter3 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter(str1, properties2);
        java.lang.String str4 = "undefined";
        java.lang.String str5 = "AR";
        calendarPartManagerParameter3.setProperty(str4, str5);
        java.util.Properties properties7 = null;
        calendarPartManagerParameter3.mergeProperties(properties7);
        configurationProviderManager0.mergeConfigurationProperties((de.focus_shift.jollyday.core.ManagerParameter) calendarPartManagerParameter3);
        java.lang.String str10 = calendarPartManagerParameter3.getDisplayName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy0 = null;
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy2 = new de.focus_shift.jollyday.core.CalendarHierarchy(calendarHierarchy0, "AR");
        java.lang.String str3 = calendarHierarchy2.getDescription();
        java.lang.String str4 = calendarHierarchy2.getDescription();
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar5 = de.focus_shift.jollyday.core.HolidayCalendar.GUERNSEY;
        boolean boolean6 = calendarHierarchy2.equals((java.lang.Object) holidayCalendar5);
        java.lang.String str7 = calendarHierarchy2.getDescription();
        java.lang.Class<?> wildcardClass8 = calendarHierarchy2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Argentina" + "'", str3, "Argentina");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Argentina" + "'", str4, "Argentina");
      Assert.assertEquals("'" + holidayCalendar5 + "' != '" + HolidayCalendar.GUERNSEY + "'", holidayCalendar5, HolidayCalendar.GUERNSEY);
      Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", false, boolean6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Argentina" + "'", str7, "Argentina");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy0 = null;
        java.lang.String str1 = "AR";
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy2 = new de.focus_shift.jollyday.core.CalendarHierarchy(calendarHierarchy0, str1);
        java.lang.String str3 = "manager.impl";
        calendarHierarchy2.setFallbackDescription(str3);
        double double5 = 0.0d;
        boolean boolean6 = calendarHierarchy2.equals((java.lang.Object) double5);
        java.lang.String str7 = calendarHierarchy2.getDescription();
        java.util.Map<java.lang.String, de.focus_shift.jollyday.core.CalendarHierarchy> strMap8 = calendarHierarchy2.getChildren();
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar9 = de.focus_shift.jollyday.core.HolidayCalendar.MOLDOVA;
        boolean boolean10 = calendarHierarchy2.equals((java.lang.Object) holidayCalendar9);
        java.lang.String str11 = calendarHierarchy2.getId();
      Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", false, boolean6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Argentina" + "'", str7, "Argentina");
        org.junit.Assert.assertNotNull(strMap8);
      Assert.assertEquals("'" + holidayCalendar9 + "' != '" + HolidayCalendar.MOLDOVA + "'", holidayCalendar9, HolidayCalendar.MOLDOVA);
      Assert.assertEquals("'" + boolean10 + "' != '" + false + "'", false, boolean10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AR" + "'", str11, "AR");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("", properties1);
        calendarPartManagerParameter2.setProperty("undefined", "AR");
        java.util.Properties properties6 = null;
        calendarPartManagerParameter2.mergeProperties(properties6);
        java.lang.String str8 = calendarPartManagerParameter2.toString();
        java.lang.String str9 = calendarPartManagerParameter2.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = calendarPartManagerParameter2.getManagerImplClassName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Missing configuration 'manager.impl'. Cannot create manager.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CalendarPartManagerParameter - " + "'", str8, "CalendarPartManagerParameter - ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        java.lang.String str0 = "";
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter(str0, properties1);
        java.util.Properties properties3 = null;
        calendarPartManagerParameter2.mergeProperties(properties3);
        java.lang.String str5 = "UA";
        java.util.Optional<java.lang.String> strOptional6 = calendarPartManagerParameter2.getProperty(str5);
        java.lang.String str7 = calendarPartManagerParameter2.createCacheKey();
        org.junit.Assert.assertNotNull(strOptional6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        java.lang.String str0 = "BR";
        boolean boolean1 = false;
        java.util.Optional<java.net.URL> uRLOptional2 = de.focus_shift.jollyday.core.util.ResourceUtil.getResource(str0, boolean1);
        org.junit.Assert.assertNotNull(uRLOptional2);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy0 = null;
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy2 = new de.focus_shift.jollyday.core.CalendarHierarchy(calendarHierarchy0, "AR");
        calendarHierarchy2.setFallbackDescription("manager.impl");
        boolean boolean6 = calendarHierarchy2.equals((java.lang.Object) 0.0d);
        java.util.Map<java.lang.String, de.focus_shift.jollyday.core.CalendarHierarchy> strMap7 = null;
        calendarHierarchy2.setChildren(strMap7);
        de.focus_shift.jollyday.core.spi.Occurrence occurrence9 = de.focus_shift.jollyday.core.spi.Occurrence.THIRD;
        boolean boolean10 = calendarHierarchy2.equals((java.lang.Object) occurrence9);
      Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", false, boolean6);
      Assert.assertEquals("'" + occurrence9 + "' != '" + Occurrence.THIRD + "'", occurrence9, Occurrence.THIRD);
      Assert.assertEquals("'" + boolean10 + "' != '" + false + "'", false, boolean10);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        de.focus_shift.jollyday.core.spi.Occurrence occurrence0 = de.focus_shift.jollyday.core.spi.Occurrence.FIRST;
      Assert.assertEquals("'" + occurrence0 + "' != '" + Occurrence.FIRST + "'", occurrence0, Occurrence.FIRST);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        java.lang.Class<de.focus_shift.jollyday.core.parser.predicates.ValidMovingCondition> validMovingConditionClass0 = null;
        de.focus_shift.jollyday.core.support.LazyServiceLoaderCache<de.focus_shift.jollyday.core.parser.predicates.ValidMovingCondition> validMovingConditionLazyServiceLoaderCache1 = new de.focus_shift.jollyday.core.support.LazyServiceLoaderCache<de.focus_shift.jollyday.core.parser.predicates.ValidMovingCondition>(validMovingConditionClass0);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        de.focus_shift.jollyday.core.spi.IslamicHolidayConfiguration.IslamicHolidayType islamicHolidayType0 = de.focus_shift.jollyday.core.spi.IslamicHolidayConfiguration.IslamicHolidayType.LAILAT_AL_BARAT;
      Assert.assertEquals("'" + islamicHolidayType0 + "' != '" + IslamicHolidayConfiguration.IslamicHolidayType.LAILAT_AL_BARAT + "'", islamicHolidayType0, IslamicHolidayConfiguration.IslamicHolidayType.LAILAT_AL_BARAT);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        de.focus_shift.jollyday.core.spi.IslamicHolidayConfiguration.IslamicHolidayType islamicHolidayType0 = de.focus_shift.jollyday.core.spi.IslamicHolidayConfiguration.IslamicHolidayType.NEWYEAR;
      Assert.assertEquals("'" + islamicHolidayType0 + "' != '" + IslamicHolidayConfiguration.IslamicHolidayType.NEWYEAR + "'", islamicHolidayType0, IslamicHolidayConfiguration.IslamicHolidayType.NEWYEAR);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        java.lang.String str0 = "";
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter(str0, properties1);
        java.lang.String str3 = "undefined";
        java.lang.String str4 = "AR";
        calendarPartManagerParameter2.setProperty(str3, str4);
        java.util.Properties properties6 = null;
        calendarPartManagerParameter2.mergeProperties(properties6);
        java.lang.String str8 = calendarPartManagerParameter2.toString();
        java.lang.String str9 = calendarPartManagerParameter2.getDisplayName();
        java.lang.String str10 = calendarPartManagerParameter2.getDisplayName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CalendarPartManagerParameter - " + "'", str8, "CalendarPartManagerParameter - ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.JORDAN;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.JORDAN + "'", holidayCalendar0, HolidayCalendar.JORDAN);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.PORTUGAL;
        de.focus_shift.jollyday.core.ManagerParameter managerParameter1 = de.focus_shift.jollyday.core.ManagerParameters.create(holidayCalendar0);
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.PORTUGAL + "'", holidayCalendar0, HolidayCalendar.PORTUGAL);
        org.junit.Assert.assertNotNull(managerParameter1);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy0 = null;
        java.lang.String str1 = "AR";
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy2 = new de.focus_shift.jollyday.core.CalendarHierarchy(calendarHierarchy0, str1);
        java.lang.String str3 = "manager.impl";
        calendarHierarchy2.setFallbackDescription(str3);
        double double5 = 0.0d;
        boolean boolean6 = calendarHierarchy2.equals((java.lang.Object) double5);
        java.lang.String str7 = calendarHierarchy2.getDescription();
        java.util.Map<java.lang.String, de.focus_shift.jollyday.core.CalendarHierarchy> strMap8 = calendarHierarchy2.getChildren();
        java.util.Map<java.lang.String, de.focus_shift.jollyday.core.CalendarHierarchy> strMap9 = calendarHierarchy2.getChildren();
      Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", false, boolean6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Argentina" + "'", str7, "Argentina");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        java.time.chrono.HijrahChronology hijrahChronology4 = de.focus_shift.jollyday.core.parser.impl.IslamicHolidayParser.HIJRAH;
        de.focus_shift.jollyday.core.parser.functions.CalculateRelativeDatesFromChronologyWithinGregorianYear calculateRelativeDatesFromChronologyWithinGregorianYear6 = new de.focus_shift.jollyday.core.parser.functions.CalculateRelativeDatesFromChronologyWithinGregorianYear((-1), 10, (java.time.chrono.Chronology) hijrahChronology4, 0);
        de.focus_shift.jollyday.core.parser.functions.CalculateRelativeDatesFromChronologyWithinGregorianYear calculateRelativeDatesFromChronologyWithinGregorianYear8 = new de.focus_shift.jollyday.core.parser.functions.CalculateRelativeDatesFromChronologyWithinGregorianYear((int) (byte) 10, (int) (byte) 1, (java.time.chrono.Chronology) hijrahChronology4, (int) (short) -1);
        org.junit.Assert.assertNotNull(hijrahChronology4);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("", properties1);
        java.lang.String str3 = calendarPartManagerParameter2.createCacheKey();
        java.util.Optional<java.lang.String> strOptional5 = calendarPartManagerParameter2.getProperty("undefined");
        java.util.Optional<java.lang.String> strOptional7 = calendarPartManagerParameter2.getProperty("CalendarPartManagerParameter - ");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL8 = calendarPartManagerParameter2.createResourceUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot find resource 'holidays/Holidays_.xml'.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strOptional5);
        org.junit.Assert.assertNotNull(strOptional7);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        java.net.URL uRL0 = null;
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.UrlManagerParameter urlManagerParameter2 = new de.focus_shift.jollyday.core.parameter.UrlManagerParameter(uRL0, properties1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = urlManagerParameter2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.toString()\" because \"this.calendarFileUrl\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("", properties1);
        calendarPartManagerParameter2.setProperty("undefined", "AR");
        java.util.Properties properties6 = null;
        calendarPartManagerParameter2.mergeProperties(properties6);
        java.lang.String str8 = calendarPartManagerParameter2.toString();
        // The following exception was thrown during execution in test generation
        try {
            de.focus_shift.jollyday.core.HolidayManager holidayManager9 = de.focus_shift.jollyday.core.HolidayManager.getInstance((de.focus_shift.jollyday.core.ManagerParameter) calendarPartManagerParameter2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot instantiate datasource instance because there is no implementations");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CalendarPartManagerParameter - " + "'", str8, "CalendarPartManagerParameter - ");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("JP", properties1);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        de.focus_shift.jollyday.core.impl.DefaultHolidayManager defaultHolidayManager0 = new de.focus_shift.jollyday.core.impl.DefaultHolidayManager();
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar1 = de.focus_shift.jollyday.core.HolidayCalendar.GERMANY;
        java.util.Properties properties2 = null;
        de.focus_shift.jollyday.core.ManagerParameter managerParameter3 = de.focus_shift.jollyday.core.ManagerParameters.create(holidayCalendar1, properties2);
        // The following exception was thrown during execution in test generation
        try {
            defaultHolidayManager0.init(managerParameter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"de.focus_shift.jollyday.core.spi.HolidayCalendarConfigurationService.getHolidayCalendarConfiguration(de.focus_shift.jollyday.core.ManagerParameter)\" because the return value of \"de.focus_shift.jollyday.core.impl.DefaultHolidayManager.getConfigurationService()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
      Assert.assertEquals("'" + holidayCalendar1 + "' != '" + HolidayCalendar.GERMANY + "'", holidayCalendar1, HolidayCalendar.GERMANY);
        org.junit.Assert.assertNotNull(managerParameter3);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.INDIA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.INDIA + "'", holidayCalendar0, HolidayCalendar.INDIA);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy0 = null;
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy2 = new de.focus_shift.jollyday.core.CalendarHierarchy(calendarHierarchy0, "AR");
        java.lang.String str3 = calendarHierarchy2.getDescription();
        java.lang.String str4 = calendarHierarchy2.getDescription();
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar5 = de.focus_shift.jollyday.core.HolidayCalendar.GUERNSEY;
        boolean boolean6 = calendarHierarchy2.equals((java.lang.Object) holidayCalendar5);
        java.lang.String str7 = calendarHierarchy2.getDescription();
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy8 = null;
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy10 = new de.focus_shift.jollyday.core.CalendarHierarchy(calendarHierarchy8, "AR");
        calendarHierarchy10.setFallbackDescription("manager.impl");
        boolean boolean14 = calendarHierarchy10.equals((java.lang.Object) 0.0d);
        boolean boolean15 = calendarHierarchy2.equals((java.lang.Object) 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Argentina" + "'", str3, "Argentina");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Argentina" + "'", str4, "Argentina");
      Assert.assertEquals("'" + holidayCalendar5 + "' != '" + HolidayCalendar.GUERNSEY + "'", holidayCalendar5, HolidayCalendar.GUERNSEY);
      Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", false, boolean6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Argentina" + "'", str7, "Argentina");
      Assert.assertEquals("'" + boolean14 + "' != '" + false + "'", false, boolean14);
      Assert.assertEquals("'" + boolean15 + "' != '" + false + "'", false, boolean15);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        java.time.Year year0 = null;
        de.focus_shift.jollyday.core.parser.functions.FindWeekDayInMonth findWeekDayInMonth1 = new de.focus_shift.jollyday.core.parser.functions.FindWeekDayInMonth(year0);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        java.time.Year year0 = null;
        de.focus_shift.jollyday.core.parser.predicates.ValidFromTo validFromTo1 = new de.focus_shift.jollyday.core.parser.predicates.ValidFromTo(year0);
        java.time.Year year2 = null;
        de.focus_shift.jollyday.core.parser.predicates.ValidFromTo validFromTo3 = new de.focus_shift.jollyday.core.parser.predicates.ValidFromTo(year2);
        java.util.function.Predicate<de.focus_shift.jollyday.core.spi.Limited> limitedPredicate4 = validFromTo1.or((java.util.function.Predicate<de.focus_shift.jollyday.core.spi.Limited>) validFromTo3);
        java.time.Year year5 = null;
        de.focus_shift.jollyday.core.parser.predicates.ValidFromTo validFromTo6 = new de.focus_shift.jollyday.core.parser.predicates.ValidFromTo(year5);
        java.time.Year year7 = null;
        de.focus_shift.jollyday.core.parser.predicates.ValidFromTo validFromTo8 = new de.focus_shift.jollyday.core.parser.predicates.ValidFromTo(year7);
        java.util.function.Predicate<de.focus_shift.jollyday.core.spi.Limited> limitedPredicate9 = validFromTo6.or((java.util.function.Predicate<de.focus_shift.jollyday.core.spi.Limited>) validFromTo8);
        java.util.function.Predicate<de.focus_shift.jollyday.core.spi.Limited> limitedPredicate10 = validFromTo8.negate();
        java.util.function.Predicate<de.focus_shift.jollyday.core.spi.Limited> limitedPredicate11 = validFromTo1.or(limitedPredicate10);
        java.util.function.Predicate<de.focus_shift.jollyday.core.spi.Limited> limitedPredicate12 = limitedPredicate10.negate();
        org.junit.Assert.assertNotNull(limitedPredicate4);
        org.junit.Assert.assertNotNull(limitedPredicate9);
        org.junit.Assert.assertNotNull(limitedPredicate10);
        org.junit.Assert.assertNotNull(limitedPredicate11);
        org.junit.Assert.assertNotNull(limitedPredicate12);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        java.lang.String str0 = "PE";
        java.util.Optional<java.net.URL> uRLOptional1 = de.focus_shift.jollyday.core.util.ResourceUtil.getResource(str0);
        org.junit.Assert.assertNotNull(uRLOptional1);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        de.focus_shift.jollyday.core.configuration.ConfigurationProviderManager configurationProviderManager0 = new de.focus_shift.jollyday.core.configuration.ConfigurationProviderManager();
        java.lang.String str1 = "";
        java.util.Properties properties2 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter3 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter(str1, properties2);
        java.lang.String str4 = "undefined";
        java.lang.String str5 = "AR";
        calendarPartManagerParameter3.setProperty(str4, str5);
        java.util.Properties properties7 = null;
        calendarPartManagerParameter3.mergeProperties(properties7);
        configurationProviderManager0.mergeConfigurationProperties((de.focus_shift.jollyday.core.ManagerParameter) calendarPartManagerParameter3);
        java.lang.String str10 = calendarPartManagerParameter3.getManagerImplClassName();
        java.lang.String str11 = calendarPartManagerParameter3.getManagerImplClassName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "de.focus_shift.jollyday.core.impl.DefaultHolidayManager" + "'", str10, "de.focus_shift.jollyday.core.impl.DefaultHolidayManager");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "de.focus_shift.jollyday.core.impl.DefaultHolidayManager" + "'", str11, "de.focus_shift.jollyday.core.impl.DefaultHolidayManager");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.CHILE;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.CHILE + "'", holidayCalendar0, HolidayCalendar.CHILE);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.VENEZUELA;
        de.focus_shift.jollyday.core.ManagerParameter managerParameter1 = de.focus_shift.jollyday.core.ManagerParameters.create(holidayCalendar0);
        java.lang.String str2 = managerParameter1.getDisplayName();
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.VENEZUELA + "'", holidayCalendar0, HolidayCalendar.VENEZUELA);
        org.junit.Assert.assertNotNull(managerParameter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ve" + "'", str2, "ve");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        de.focus_shift.jollyday.core.spi.IslamicHolidayConfiguration.IslamicHolidayType islamicHolidayType0 = de.focus_shift.jollyday.core.spi.IslamicHolidayConfiguration.IslamicHolidayType.RAMADAN_END;
      Assert.assertEquals("'" + islamicHolidayType0 + "' != '" + IslamicHolidayConfiguration.IslamicHolidayType.RAMADAN_END + "'", islamicHolidayType0, IslamicHolidayConfiguration.IslamicHolidayType.RAMADAN_END);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        de.focus_shift.jollyday.core.spi.IslamicHolidayConfiguration.IslamicHolidayType islamicHolidayType0 = de.focus_shift.jollyday.core.spi.IslamicHolidayConfiguration.IslamicHolidayType.LAILAT_AL_QADR;
      Assert.assertEquals("'" + islamicHolidayType0 + "' != '" + IslamicHolidayConfiguration.IslamicHolidayType.LAILAT_AL_QADR + "'", islamicHolidayType0, IslamicHolidayConfiguration.IslamicHolidayType.LAILAT_AL_QADR);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy0 = null;
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy2 = new de.focus_shift.jollyday.core.CalendarHierarchy(calendarHierarchy0, "AR");
        calendarHierarchy2.setFallbackDescription("manager.impl");
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = calendarHierarchy2.getDescription(locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        java.lang.String str0 = "";
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter(str0, properties1);
        java.lang.String str3 = calendarPartManagerParameter2.toString();
        java.util.Properties properties4 = null;
        calendarPartManagerParameter2.mergeProperties(properties4);
        java.lang.String str6 = calendarPartManagerParameter2.getDisplayName();
        java.lang.String str7 = calendarPartManagerParameter2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CalendarPartManagerParameter - " + "'", str3, "CalendarPartManagerParameter - ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CalendarPartManagerParameter - " + "'", str7, "CalendarPartManagerParameter - ");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("", properties1);
        calendarPartManagerParameter2.setProperty("undefined", "AR");
        java.util.Properties properties6 = null;
        calendarPartManagerParameter2.mergeProperties(properties6);
        java.lang.String str8 = calendarPartManagerParameter2.toString();
        java.lang.String str9 = calendarPartManagerParameter2.getDisplayName();
        java.lang.String str10 = calendarPartManagerParameter2.createCacheKey();
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL11 = calendarPartManagerParameter2.createResourceUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot find resource 'holidays/Holidays_.xml'.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CalendarPartManagerParameter - " + "'", str8, "CalendarPartManagerParameter - ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        java.time.chrono.HijrahChronology hijrahChronology4 = de.focus_shift.jollyday.core.parser.impl.IslamicHolidayParser.HIJRAH;
        de.focus_shift.jollyday.core.parser.functions.CalculateRelativeDatesFromChronologyWithinGregorianYear calculateRelativeDatesFromChronologyWithinGregorianYear6 = new de.focus_shift.jollyday.core.parser.functions.CalculateRelativeDatesFromChronologyWithinGregorianYear((-1), 10, (java.time.chrono.Chronology) hijrahChronology4, 0);
        de.focus_shift.jollyday.core.parser.functions.CalculateRelativeDatesFromChronologyWithinGregorianYear calculateRelativeDatesFromChronologyWithinGregorianYear8 = new de.focus_shift.jollyday.core.parser.functions.CalculateRelativeDatesFromChronologyWithinGregorianYear(0, (-1), (java.time.chrono.Chronology) hijrahChronology4, (int) (short) 0);
        org.junit.Assert.assertNotNull(hijrahChronology4);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        java.lang.String str0 = "configuration.service.impl";
        java.lang.String str1 = de.focus_shift.jollyday.core.util.ResourceUtil.getHolidayDescription(str0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "undefined" + "'", str1, "undefined");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy0 = null;
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy2 = new de.focus_shift.jollyday.core.CalendarHierarchy(calendarHierarchy0, "AR");
        java.lang.String str3 = calendarHierarchy2.getDescription();
        java.net.URL uRL4 = null;
        java.util.Properties properties5 = null;
        de.focus_shift.jollyday.core.parameter.UrlManagerParameter urlManagerParameter6 = new de.focus_shift.jollyday.core.parameter.UrlManagerParameter(uRL4, properties5);
        boolean boolean7 = calendarHierarchy2.equals((java.lang.Object) uRL4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Argentina" + "'", str3, "Argentina");
      Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", false, boolean7);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        java.lang.String str0 = "undefined";
        de.focus_shift.jollyday.core.ManagerParameter managerParameter1 = de.focus_shift.jollyday.core.ManagerParameters.create(str0);
        org.junit.Assert.assertNotNull(managerParameter1);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy0 = null;
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy2 = new de.focus_shift.jollyday.core.CalendarHierarchy(calendarHierarchy0, "AR");
        calendarHierarchy2.setFallbackDescription("manager.impl");
        boolean boolean6 = calendarHierarchy2.equals((java.lang.Object) 0.0d);
        java.util.Map<java.lang.String, de.focus_shift.jollyday.core.CalendarHierarchy> strMap7 = null;
        calendarHierarchy2.setChildren(strMap7);
        calendarHierarchy2.setFallbackDescription("ve");
      Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", false, boolean6);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy0 = null;
        java.lang.String str1 = "AR";
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy2 = new de.focus_shift.jollyday.core.CalendarHierarchy(calendarHierarchy0, str1);
        java.lang.String str3 = "manager.impl";
        calendarHierarchy2.setFallbackDescription(str3);
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy5 = null;
        java.lang.String str6 = "AR";
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy7 = new de.focus_shift.jollyday.core.CalendarHierarchy(calendarHierarchy5, str6);
        java.lang.String str8 = "manager.impl";
        calendarHierarchy7.setFallbackDescription(str8);
        double double10 = 0.0d;
        boolean boolean11 = calendarHierarchy7.equals((java.lang.Object) double10);
        java.util.Map<java.lang.String, de.focus_shift.jollyday.core.CalendarHierarchy> strMap12 = calendarHierarchy7.getChildren();
        calendarHierarchy2.setChildren(strMap12);
        java.lang.String str14 = "configuration.service.impl";
        calendarHierarchy2.setFallbackDescription(str14);
        java.lang.String str16 = calendarHierarchy2.getId();
      Assert.assertEquals("'" + boolean11 + "' != '" + false + "'", false, boolean11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AR" + "'", str16, "AR");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = de.focus_shift.jollyday.core.util.ClassLoadingUtil.loadClass("parser.impl.");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: parser.impl.");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy0 = null;
        java.lang.String str1 = "AR";
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy2 = new de.focus_shift.jollyday.core.CalendarHierarchy(calendarHierarchy0, str1);
        java.lang.String str3 = "manager.impl";
        calendarHierarchy2.setFallbackDescription(str3);
        double double5 = 0.0d;
        boolean boolean6 = calendarHierarchy2.equals((java.lang.Object) double5);
        java.util.Map<java.lang.String, de.focus_shift.jollyday.core.CalendarHierarchy> strMap7 = calendarHierarchy2.getChildren();
        java.util.Map<java.lang.String, de.focus_shift.jollyday.core.CalendarHierarchy> strMap8 = calendarHierarchy2.getChildren();
        java.lang.String str9 = "UA";
        calendarHierarchy2.setFallbackDescription(str9);
        java.util.Map<java.lang.String, de.focus_shift.jollyday.core.CalendarHierarchy> strMap11 = calendarHierarchy2.getChildren();
      Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", false, boolean6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("CalendarPartManagerParameter - ", properties1);
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = calendarPartManagerParameter2.createResourceUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot find resource 'holidays/Holidays_CalendarPartManagerParameter - .xml'.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.BOTSWANA;
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.BOTSWANA + "'", holidayCalendar0, HolidayCalendar.BOTSWANA);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = de.focus_shift.jollyday.core.util.ClassLoadingUtil.loadClass("file:/mnt/c/Users/luiza/OneDrive/%c3%81rea%20de%20Trabalho/programa%c3%a7%c3%a3o/es/jollyday/jollyday-core/target/classes/holidays/Holidays_de.xml");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: file:/mnt/c/Users/luiza/OneDrive/%c3%81rea%20de%20Trabalho/programa%c3%a7%c3%a3o/es/jollyday/jollyday-core/target/classes/holidays/Holidays_de.xml");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        java.time.Year year0 = null;
        de.focus_shift.jollyday.core.parser.functions.CalculateEasterSunday calculateEasterSunday1 = new de.focus_shift.jollyday.core.parser.functions.CalculateEasterSunday(year0);
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy2 = null;
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy4 = new de.focus_shift.jollyday.core.CalendarHierarchy(calendarHierarchy2, "AR");
        calendarHierarchy4.setFallbackDescription("manager.impl");
        java.util.Map<java.lang.String, de.focus_shift.jollyday.core.CalendarHierarchy> strMap7 = null;
        calendarHierarchy4.setChildren(strMap7);
        java.time.chrono.HijrahChronology hijrahChronology11 = de.focus_shift.jollyday.core.parser.impl.IslamicHolidayParser.HIJRAH;
        de.focus_shift.jollyday.core.parser.functions.CalculateRelativeDatesFromChronologyWithinGregorianYear calculateRelativeDatesFromChronologyWithinGregorianYear13 = new de.focus_shift.jollyday.core.parser.functions.CalculateRelativeDatesFromChronologyWithinGregorianYear((-1), 10, (java.time.chrono.Chronology) hijrahChronology11, 0);
        boolean boolean14 = calendarHierarchy4.equals((java.lang.Object) hijrahChronology11);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate15 = calculateEasterSunday1.apply((java.time.chrono.Chronology) hijrahChronology11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.Year.isAfter(java.time.Year)\" because \"this.year\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hijrahChronology11);
      Assert.assertEquals("'" + boolean14 + "' != '" + false + "'", false, boolean14);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        de.focus_shift.jollyday.core.ManagerParameter managerParameter1 = de.focus_shift.jollyday.core.ManagerParameters.create("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = managerParameter1.getParserImplClassName("BR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot create parsers. No parser implementation defined for class BR in properties with key parser.impl.BR");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(managerParameter1);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        java.lang.String str0 = "RO";
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.ManagerParameter managerParameter2 = de.focus_shift.jollyday.core.ManagerParameters.create(str0, properties1);
        org.junit.Assert.assertNotNull(managerParameter2);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        java.lang.String str0 = "manager.impl";
        de.focus_shift.jollyday.core.ManagerParameter managerParameter1 = de.focus_shift.jollyday.core.ManagerParameters.create(str0);
        org.junit.Assert.assertNotNull(managerParameter1);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy0 = null;
        java.lang.String str1 = "AR";
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy2 = new de.focus_shift.jollyday.core.CalendarHierarchy(calendarHierarchy0, str1);
        java.lang.String str3 = "manager.impl";
        calendarHierarchy2.setFallbackDescription(str3);
        double double5 = 0.0d;
        boolean boolean6 = calendarHierarchy2.equals((java.lang.Object) double5);
        java.lang.String str7 = calendarHierarchy2.getDescription();
        java.util.Map<java.lang.String, de.focus_shift.jollyday.core.CalendarHierarchy> strMap8 = calendarHierarchy2.getChildren();
        java.lang.String str9 = calendarHierarchy2.getDescription();
        java.lang.String str10 = "undefined";
        calendarHierarchy2.setFallbackDescription(str10);
        java.lang.String str12 = calendarHierarchy2.getId();
      Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", false, boolean6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Argentina" + "'", str7, "Argentina");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Argentina" + "'", str9, "Argentina");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AR" + "'", str12, "AR");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        java.lang.String str0 = "UrlManagerParameter - file:/mnt/c/Users/luiza/OneDrive/%c3%81rea%20de%20Trabalho/programa%c3%a7%c3%a3o/es/jollyday/jollyday-core/target/classes/holidays/Holidays_de.xml";
        boolean boolean1 = false;
        java.util.Optional<java.net.URL> uRLOptional2 = de.focus_shift.jollyday.core.util.ResourceUtil.getResource(str0, boolean1);
        org.junit.Assert.assertNotNull(uRLOptional2);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("", properties1);
        java.util.Properties properties3 = null;
        calendarPartManagerParameter2.mergeProperties(properties3);
        java.util.Optional<java.lang.String> strOptional6 = calendarPartManagerParameter2.getProperty("UA");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = calendarPartManagerParameter2.getManagerImplClassName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Missing configuration 'manager.impl'. Cannot create manager.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strOptional6);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType christianHolidayType0 = de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration.ChristianHolidayType.PENTECOST_MONDAY;
      Assert.assertEquals("'" + christianHolidayType0 + "' != '" + ChristianHolidayConfiguration.ChristianHolidayType.PENTECOST_MONDAY + "'", christianHolidayType0, ChristianHolidayConfiguration.ChristianHolidayType.PENTECOST_MONDAY);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        java.time.LocalDate localDate0 = null;
        de.focus_shift.jollyday.core.parser.predicates.ValidMovingCondition validMovingCondition1 = new de.focus_shift.jollyday.core.parser.predicates.ValidMovingCondition(localDate0);
        java.util.function.Predicate<de.focus_shift.jollyday.core.spi.Movable.MovingCondition> movingConditionPredicate2 = validMovingCondition1.negate();
        java.util.function.Predicate<de.focus_shift.jollyday.core.spi.Movable.MovingCondition> movingConditionPredicate3 = validMovingCondition1.negate();
        java.util.function.Predicate<de.focus_shift.jollyday.core.spi.Movable.MovingCondition> movingConditionPredicate4 = movingConditionPredicate3.negate();
        org.junit.Assert.assertNotNull(movingConditionPredicate2);
        org.junit.Assert.assertNotNull(movingConditionPredicate3);
        org.junit.Assert.assertNotNull(movingConditionPredicate4);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        java.time.LocalDate localDate0 = null;
        de.focus_shift.jollyday.core.parser.predicates.ValidMovingCondition validMovingCondition1 = new de.focus_shift.jollyday.core.parser.predicates.ValidMovingCondition(localDate0);
        java.util.function.Predicate<de.focus_shift.jollyday.core.spi.Movable.MovingCondition> movingConditionPredicate2 = validMovingCondition1.negate();
        java.util.function.Predicate<de.focus_shift.jollyday.core.spi.Movable.MovingCondition> movingConditionPredicate3 = validMovingCondition1.negate();
        java.util.function.Predicate<de.focus_shift.jollyday.core.spi.Movable.MovingCondition> movingConditionPredicate4 = validMovingCondition1.negate();
        java.util.function.Predicate<de.focus_shift.jollyday.core.spi.Movable.MovingCondition> movingConditionPredicate5 = validMovingCondition1.negate();
        de.focus_shift.jollyday.core.spi.Movable.MovingCondition movingCondition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = validMovingCondition1.test(movingCondition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.getDayOfWeek()\" because \"this.date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(movingConditionPredicate2);
        org.junit.Assert.assertNotNull(movingConditionPredicate3);
        org.junit.Assert.assertNotNull(movingConditionPredicate4);
        org.junit.Assert.assertNotNull(movingConditionPredicate5);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        de.focus_shift.jollyday.core.HolidayCalendar holidayCalendar0 = de.focus_shift.jollyday.core.HolidayCalendar.JAMAICA;
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.ManagerParameter managerParameter2 = de.focus_shift.jollyday.core.ManagerParameters.create(holidayCalendar0, properties1);
      Assert.assertEquals("'" + holidayCalendar0 + "' != '" + HolidayCalendar.JAMAICA + "'", holidayCalendar0, HolidayCalendar.JAMAICA);
        org.junit.Assert.assertNotNull(managerParameter2);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        java.lang.String str0 = "";
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter(str0, properties1);
        java.lang.String str3 = calendarPartManagerParameter2.createCacheKey();
        java.util.Properties properties4 = null;
        calendarPartManagerParameter2.mergeProperties(properties4);
        java.lang.String str6 = calendarPartManagerParameter2.getDisplayName();
        java.lang.String str7 = calendarPartManagerParameter2.createCacheKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        de.focus_shift.jollyday.core.ManagerParameter managerParameter1 = de.focus_shift.jollyday.core.ManagerParameters.create("Argentina");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = managerParameter1.getManagerImplClassName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Missing configuration 'manager.impl'. Cannot create manager.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(managerParameter1);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        de.focus_shift.jollyday.core.caching.Cache<java.io.Serializable> serializableCache0 = new de.focus_shift.jollyday.core.caching.Cache<java.io.Serializable>();
        serializableCache0.clear();
        serializableCache0.clear();
        serializableCache0.clear();
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("", properties1);
        java.util.Properties properties3 = null;
        calendarPartManagerParameter2.mergeProperties(properties3);
        java.util.Optional<java.lang.String> strOptional6 = calendarPartManagerParameter2.getProperty("UA");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = calendarPartManagerParameter2.getManagerImplClassName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Missing configuration 'manager.impl'. Cannot create manager.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strOptional6);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        java.lang.String str0 = "";
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter(str0, properties1);
        java.lang.String str3 = calendarPartManagerParameter2.createCacheKey();
        java.lang.String str4 = "hi!";
        java.util.Optional<java.lang.String> strOptional5 = calendarPartManagerParameter2.getProperty(str4);
        java.lang.String str6 = "de.focus_shift.jollyday.core.impl.DefaultHolidayManager";
        java.util.Optional<java.lang.String> strOptional7 = calendarPartManagerParameter2.getProperty(str6);
        java.lang.String str8 = calendarPartManagerParameter2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strOptional5);
        org.junit.Assert.assertNotNull(strOptional7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CalendarPartManagerParameter - " + "'", str8, "CalendarPartManagerParameter - ");
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        java.lang.String str0 = "";
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter(str0, properties1);
        java.lang.String str3 = calendarPartManagerParameter2.createCacheKey();
        java.lang.String str4 = "hi!";
        java.util.Optional<java.lang.String> strOptional5 = calendarPartManagerParameter2.getProperty(str4);
        java.lang.String str6 = "de.focus_shift.jollyday.core.impl.DefaultHolidayManager";
        java.util.Optional<java.lang.String> strOptional7 = calendarPartManagerParameter2.getProperty(str6);
        java.lang.String str8 = "hi!";
        java.util.Optional<java.lang.String> strOptional9 = calendarPartManagerParameter2.getProperty(str8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strOptional5);
        org.junit.Assert.assertNotNull(strOptional7);
        org.junit.Assert.assertNotNull(strOptional9);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("", properties1);
        java.lang.String str3 = calendarPartManagerParameter2.createCacheKey();
        java.lang.String str4 = calendarPartManagerParameter2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = calendarPartManagerParameter2.getParserImplClassName("file:/mnt/c/Users/luiza/OneDrive/%c3%81rea%20de%20Trabalho/programa%c3%a7%c3%a3o/es/jollyday/jollyday-core/target/classes/holidays/Holidays_de.xml");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot create parsers. No parser implementation defined for class file:/mnt/c/Users/luiza/OneDrive/%c3%81rea%20de%20Trabalho/programa%c3%a7%c3%a3o/es/jollyday/jollyday-core/target/classes/holidays/Holidays_de.xml in properties with key parser.impl.file:/mnt/c/Users/luiza/OneDrive/%c3%81rea%20de%20Trabalho/programa%c3%a7%c3%a3o/es/jollyday/jollyday-core/target/classes/holidays/Holidays_de.xml");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CalendarPartManagerParameter - " + "'", str4, "CalendarPartManagerParameter - ");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        java.lang.String str0 = "BR";
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.ManagerParameter managerParameter2 = de.focus_shift.jollyday.core.ManagerParameters.create(str0, properties1);
        org.junit.Assert.assertNotNull(managerParameter2);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter calendarPartManagerParameter2 = new de.focus_shift.jollyday.core.parameter.CalendarPartManagerParameter("", properties1);
        java.lang.String str3 = calendarPartManagerParameter2.createCacheKey();
        java.util.Optional<java.lang.String> strOptional5 = calendarPartManagerParameter2.getProperty("undefined");
        java.util.Properties properties6 = null;
        calendarPartManagerParameter2.mergeProperties(properties6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = calendarPartManagerParameter2.getParserImplClassName("PE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot create parsers. No parser implementation defined for class PE in properties with key parser.impl.PE");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strOptional5);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy0 = null;
        java.lang.String str1 = "AR";
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy2 = new de.focus_shift.jollyday.core.CalendarHierarchy(calendarHierarchy0, str1);
        java.lang.String str3 = "manager.impl";
        calendarHierarchy2.setFallbackDescription(str3);
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy5 = null;
        java.lang.String str6 = "AR";
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy7 = new de.focus_shift.jollyday.core.CalendarHierarchy(calendarHierarchy5, str6);
        java.lang.String str8 = "manager.impl";
        calendarHierarchy7.setFallbackDescription(str8);
        double double10 = 0.0d;
        boolean boolean11 = calendarHierarchy7.equals((java.lang.Object) double10);
        java.util.Map<java.lang.String, de.focus_shift.jollyday.core.CalendarHierarchy> strMap12 = calendarHierarchy7.getChildren();
        calendarHierarchy2.setChildren(strMap12);
        java.util.Map<java.lang.String, de.focus_shift.jollyday.core.CalendarHierarchy> strMap14 = calendarHierarchy2.getChildren();
        java.util.Map<java.lang.String, de.focus_shift.jollyday.core.CalendarHierarchy> strMap15 = calendarHierarchy2.getChildren();
      Assert.assertEquals("'" + boolean11 + "' != '" + false + "'", false, boolean11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
    }
}

