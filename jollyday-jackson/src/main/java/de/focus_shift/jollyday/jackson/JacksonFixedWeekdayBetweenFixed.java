package de.focus_shift.jollyday.jackson;

import de.focus_shift.jollyday.core.HolidayType;
import de.focus_shift.jollyday.core.spi.FixedHolidayConfiguration;
import de.focus_shift.jollyday.core.spi.FixedWeekdayBetweenFixedHolidayConfiguration;
import de.focus_shift.jollyday.jackson.mapping.FixedWeekdayBetweenFixed;
import org.jspecify.annotations.NonNull;

import java.time.DayOfWeek;
import java.time.Year;
import java.util.Optional;

class JacksonFixedWeekdayBetweenFixed extends AbstractJacksonHolidayConfiguration implements FixedWeekdayBetweenFixedHolidayConfiguration {

  private final FixedWeekdayBetweenFixed fixedWeekdayBetweenFixed;

  JacksonFixedWeekdayBetweenFixed(FixedWeekdayBetweenFixed fixedWeekdayInMonth) {
    this.fixedWeekdayBetweenFixed = fixedWeekdayInMonth;
  }

  @Override
  public @NonNull FixedHolidayConfiguration from() {
    return new JacksonFixed(fixedWeekdayBetweenFixed.getFrom());
  }

  @Override
  public @NonNull FixedHolidayConfiguration to() {
    return new JacksonFixed(fixedWeekdayBetweenFixed.getTo());
  }

  @Override
  public @NonNull DayOfWeek weekday() {
    return DayOfWeek.valueOf(fixedWeekdayBetweenFixed.getWeekday().name());
  }

  @Override
  public @NonNull String descriptionPropertiesKey() {
    return fixedWeekdayBetweenFixed.getDescriptionPropertiesKey();
  }

  @Override
  public @NonNull HolidayType holidayType() {
    return mapHolidayType(fixedWeekdayBetweenFixed.getLocalizedType());
  }

  @Override
  public @NonNull Optional<Year> validFrom() {
    return mapToYear(fixedWeekdayBetweenFixed.getValidFrom());
  }

  @Override
  public @NonNull Optional<Year> validTo() {
    return mapToYear(fixedWeekdayBetweenFixed.getValidTo());
  }

  @Override
  public @NonNull YearCycle cycle() {
    return mapCycle(fixedWeekdayBetweenFixed.getEvery() , YearCycle.class);
  }
}