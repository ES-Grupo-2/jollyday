package de.focus_shift.jollyday.jackson;

import de.focus_shift.jollyday.core.HolidayType;
import de.focus_shift.jollyday.core.spi.FixedHolidayConfiguration;
import de.focus_shift.jollyday.core.spi.FixedWeekdayRelativeToFixedHolidayConfiguration;
import de.focus_shift.jollyday.core.spi.Occurrence;
import de.focus_shift.jollyday.core.spi.Relation;
import de.focus_shift.jollyday.jackson.mapping.FixedWeekdayRelativeToFixed;
import org.jspecify.annotations.NonNull;

import java.time.DayOfWeek;
import java.time.Year;
import java.util.Optional;

class JacksonFixedWeekdayRelativeToFixed extends AbstractJacksonHolidayConfiguration implements FixedWeekdayRelativeToFixedHolidayConfiguration {

  private final FixedWeekdayRelativeToFixed fixedWeekdayRelativeToFixed;

  JacksonFixedWeekdayRelativeToFixed(FixedWeekdayRelativeToFixed fixedWeekdayRelativeToFixed) {
    this.fixedWeekdayRelativeToFixed = fixedWeekdayRelativeToFixed;
  }

  @Override
  public @NonNull DayOfWeek weekday() {
    return DayOfWeek.valueOf(fixedWeekdayRelativeToFixed.getWeekday().name());
  }

  @Override
  public @NonNull Relation when() {
    return Relation.valueOf(fixedWeekdayRelativeToFixed.getWhen().name());
  }

  @Override
  public @NonNull FixedHolidayConfiguration day() {
    return new JacksonFixed(fixedWeekdayRelativeToFixed.getDay());
  }

  @Override
  public @NonNull Occurrence which() {
    return Occurrence.valueOf(fixedWeekdayRelativeToFixed.getWhich().name());
  }

  @Override
  public @NonNull String descriptionPropertiesKey() {
    return fixedWeekdayRelativeToFixed.getDescriptionPropertiesKey();
  }

  @Override
  public @NonNull HolidayType holidayType() {
    return mapHolidayType(fixedWeekdayRelativeToFixed.getLocalizedType());
  }

  @Override
  public @NonNull Optional<Year> validFrom() {
    return mapToYear(fixedWeekdayRelativeToFixed.getValidFrom());
  }

  @Override
  public @NonNull Optional<Year> validTo() {
    return mapToYear(fixedWeekdayRelativeToFixed.getValidTo());
  }

  @Override
  public @NonNull YearCycle cycle() {
    return mapCycle(fixedWeekdayRelativeToFixed.getEvery() , YearCycle.class);
  }
}