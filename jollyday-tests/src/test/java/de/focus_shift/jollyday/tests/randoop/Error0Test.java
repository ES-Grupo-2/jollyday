package de.focus_shift.jollyday.tests.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Error0Test {

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        de.focus_shift.jollyday.core.impl.DefaultHolidayManager defaultHolidayManager0 = new de.focus_shift.jollyday.core.impl.DefaultHolidayManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy1 = defaultHolidayManager0.getCalendarHierarchy();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        de.focus_shift.jollyday.core.impl.DefaultHolidayManager defaultHolidayManager0 = new de.focus_shift.jollyday.core.impl.DefaultHolidayManager();
        de.focus_shift.jollyday.core.spi.HolidayCalendarConfigurationService holidayCalendarConfigurationService1 = defaultHolidayManager0.getConfigurationService();
        // Checks the post-condition: result must be non-null
        org.junit.Assert.assertTrue("Post-condition: result must be non-null", holidayCalendarConfigurationService1 != null);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        de.focus_shift.jollyday.core.impl.DefaultHolidayManager defaultHolidayManager0 = new de.focus_shift.jollyday.core.impl.DefaultHolidayManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy1 = defaultHolidayManager0.getCalendarHierarchy();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        de.focus_shift.jollyday.core.impl.DefaultHolidayManager defaultHolidayManager0 = new de.focus_shift.jollyday.core.impl.DefaultHolidayManager();
        de.focus_shift.jollyday.core.ManagerParameter managerParameter1 = defaultHolidayManager0.getManagerParameter();
        // Checks the post-condition: result must be non-null
        org.junit.Assert.assertTrue("Post-condition: result must be non-null", managerParameter1 != null);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        de.focus_shift.jollyday.core.impl.DefaultHolidayManager defaultHolidayManager0 = new de.focus_shift.jollyday.core.impl.DefaultHolidayManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultHolidayManager0.doInit();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        java.net.URL uRL0 = null;
        java.util.Properties properties1 = null;
        de.focus_shift.jollyday.core.parameter.UrlManagerParameter urlManagerParameter2 = new de.focus_shift.jollyday.core.parameter.UrlManagerParameter(uRL0, properties1);
        java.net.URL uRL3 = urlManagerParameter2.createResourceUrl();
        // Checks the post-condition: result must be non-null
        org.junit.Assert.assertTrue("Post-condition: result must be non-null", uRL3 != null);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        de.focus_shift.jollyday.core.impl.JapaneseBridgingHolidayManager japaneseBridgingHolidayManager0 = new de.focus_shift.jollyday.core.impl.JapaneseBridgingHolidayManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy1 = japaneseBridgingHolidayManager0.getCalendarHierarchy();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        de.focus_shift.jollyday.core.impl.JapaneseBridgingHolidayManager japaneseBridgingHolidayManager0 = new de.focus_shift.jollyday.core.impl.JapaneseBridgingHolidayManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        japaneseBridgingHolidayManager0.doInit();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        de.focus_shift.jollyday.core.impl.JapaneseBridgingHolidayManager japaneseBridgingHolidayManager0 = new de.focus_shift.jollyday.core.impl.JapaneseBridgingHolidayManager();
        de.focus_shift.jollyday.core.spi.HolidayCalendarConfigurationService holidayCalendarConfigurationService1 = japaneseBridgingHolidayManager0.getConfigurationService();
        // Checks the post-condition: result must be non-null
        org.junit.Assert.assertTrue("Post-condition: result must be non-null", holidayCalendarConfigurationService1 != null);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        de.focus_shift.jollyday.core.impl.JapaneseBridgingHolidayManager japaneseBridgingHolidayManager0 = new de.focus_shift.jollyday.core.impl.JapaneseBridgingHolidayManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        japaneseBridgingHolidayManager0.doInit();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        de.focus_shift.jollyday.core.impl.JapaneseBridgingHolidayManager japaneseBridgingHolidayManager0 = new de.focus_shift.jollyday.core.impl.JapaneseBridgingHolidayManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy1 = japaneseBridgingHolidayManager0.getCalendarHierarchy();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        de.focus_shift.jollyday.core.impl.DefaultHolidayManager defaultHolidayManager0 = new de.focus_shift.jollyday.core.impl.DefaultHolidayManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultHolidayManager0.doInit();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy0 = null;
        java.lang.String str1 = "AR";
        de.focus_shift.jollyday.core.CalendarHierarchy calendarHierarchy2 = new de.focus_shift.jollyday.core.CalendarHierarchy(calendarHierarchy0, str1);
        java.lang.String str3 = "manager.impl";
        calendarHierarchy2.setFallbackDescription(str3);
        double double5 = 0.0d;
        boolean boolean6 = calendarHierarchy2.equals((java.lang.Object) double5);
        java.util.Map<java.lang.String, de.focus_shift.jollyday.core.CalendarHierarchy> strMap7 = null;
        calendarHierarchy2.setChildren(strMap7);
        java.util.Map<java.lang.String, de.focus_shift.jollyday.core.CalendarHierarchy> strMap9 = calendarHierarchy2.getChildren();
        // Checks the post-condition: result must be non-null
        org.junit.Assert.assertTrue("Post-condition: result must be non-null", strMap9 != null);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        de.focus_shift.jollyday.core.impl.JapaneseBridgingHolidayManager japaneseBridgingHolidayManager0 = new de.focus_shift.jollyday.core.impl.JapaneseBridgingHolidayManager();
        de.focus_shift.jollyday.core.ManagerParameter managerParameter1 = japaneseBridgingHolidayManager0.getManagerParameter();
        // Checks the post-condition: result must be non-null
        org.junit.Assert.assertTrue("Post-condition: result must be non-null", managerParameter1 != null);
    }
}

