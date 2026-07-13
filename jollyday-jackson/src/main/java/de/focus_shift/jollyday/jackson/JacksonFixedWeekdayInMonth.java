package de.focus_shift.jollyday.jackson;

import de.focus_shift.jollyday.core.HolidayType;
import de.focus_shift.jollyday.core.spi.FixedWeekdayInMonthHolidayConfiguration;
import de.focus_shift.jollyday.core.spi.Movable;
import de.focus_shift.jollyday.core.spi.Occurrence;
import de.focus_shift.jollyday.jackson.mapping.FixedWeekdayInMonth;
import org.jspecify.annotations.NonNull;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;
import java.util.List;
import java.util.Optional;

class JacksonFixedWeekdayInMonth extends AbstractJacksonHolidayConfiguration implements FixedWeekdayInMonthHolidayConfiguration {

  private final FixedWeekdayInMonth fixedWeekdayInMonth;

  JacksonFixedWeekdayInMonth(FixedWeekdayInMonth fixedWeekdayInMonth) {
    this.fixedWeekdayInMonth = fixedWeekdayInMonth;
  }

  @Override
  public @NonNull DayOfWeek weekday() {
    return DayOfWeek.valueOf(fixedWeekdayInMonth.getWeekday().name());
  }

  @Override
  public @NonNull Month month() {
    return Month.valueOf(fixedWeekdayInMonth.getMonth().name());
  }

  @Override
  public @NonNull Occurrence which() {
    return Occurrence.valueOf(fixedWeekdayInMonth.getWhich().name());
  }

  @Override
  public @NonNull String descriptionPropertiesKey() {
    return fixedWeekdayInMonth.getDescriptionPropertiesKey();
  }

  @Override
  public @NonNull HolidayType holidayType() {
    return mapHolidayType(fixedWeekdayInMonth.getLocalizedType());
  }

  @Override
  public @NonNull Optional<Year> validFrom() {
    return mapToYear(fixedWeekdayInMonth.getValidFrom());
  }

  @Override
  public @NonNull Optional<Year> validTo() {
    return mapToYear(fixedWeekdayInMonth.getValidTo());
  }

  @Override
  public @NonNull YearCycle cycle() {
    return mapCycle(fixedWeekdayInMonth.getEvery() , YearCycle.class);
  }

  @Override
  public @NonNull List<Movable.MovingCondition> conditions() {
    return fixedWeekdayInMonth.getMovingCondition().stream()
      .map(JacksonMovingCondition::new)
      .map(Movable.MovingCondition.class::cast)
      .toList();
  }
}