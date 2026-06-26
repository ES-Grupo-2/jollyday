package de.focus_shift.jollyday.jackson;

import de.focus_shift.jollyday.core.HolidayType;
import de.focus_shift.jollyday.core.spi.FixedHolidayConfiguration;
import de.focus_shift.jollyday.jackson.mapping.Fixed;
import org.jspecify.annotations.NonNull;

import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.util.List;
import java.util.Optional;

class JacksonFixed extends AbstractJacksonHolidayConfiguration implements FixedHolidayConfiguration {

  private final Fixed fixed;

  JacksonFixed(Fixed fixed) {
    this.fixed = fixed;
  }

  @Override
  public @NonNull MonthDay day() {
    return MonthDay.of(Month.valueOf(fixed.getMonth().value()), fixed.getDay());
  }

  @Override
  public @NonNull String descriptionPropertiesKey() {
    return fixed.getDescriptionPropertiesKey();
  }

  @Override
  public @NonNull HolidayType holidayType() {
    return mapHolidayType(fixed.getLocalizedType());
  }

  @Override
  public @NonNull Optional<Year> validFrom() {
    return mapToYear(fixed.getValidFrom());
  }

  @Override
  public @NonNull Optional<Year> validTo() {
    return mapToYear(fixed.getValidTo());
  }

  @Override
  public @NonNull YearCycle cycle() {
    return mapCycle(fixed.getEvery() , YearCycle.class);
  }

  @Override
  public @NonNull List<MovingCondition> conditions() {
    return fixed.getMovingCondition().stream()
      .map(JacksonMovingCondition::new)
      .map(MovingCondition.class::cast)
      .toList();
  }
}