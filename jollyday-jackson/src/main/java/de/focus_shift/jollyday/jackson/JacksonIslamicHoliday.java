package de.focus_shift.jollyday.jackson;

import de.focus_shift.jollyday.core.HolidayType;
import de.focus_shift.jollyday.core.spi.IslamicHolidayConfiguration;
import de.focus_shift.jollyday.jackson.mapping.IslamicHoliday;
import org.jspecify.annotations.NonNull;

import java.time.Year;
import java.util.List;
import java.util.Optional;

class JacksonIslamicHoliday extends AbstractJacksonHolidayConfiguration implements IslamicHolidayConfiguration {

  private final IslamicHoliday islamicHoliday;

  JacksonIslamicHoliday(IslamicHoliday christianHoliday) {
    this.islamicHoliday = christianHoliday;
  }

  @Override
  public @NonNull IslamicHolidayType type() {
    return IslamicHolidayType.valueOf(islamicHoliday.getType().name());
  }

  @Override
  public @NonNull String descriptionPropertiesKey() {
    return mapDescriptionKey(islamicHoliday.getDescriptionPropertiesKey(), descriptionPropertiesKeyPrefix(), descriptionPropertiesKeyPrefixSeparator(), type());
  }

  @Override
  public @NonNull HolidayType holidayType() {
    return mapHolidayType(islamicHoliday.getLocalizedType());
  }

  @Override
  public @NonNull Optional<Year> validFrom() {
    return mapToYear(islamicHoliday.getValidFrom());
  }

  @Override
  public @NonNull Optional<Year> validTo() {
    return mapToYear(islamicHoliday.getValidTo());
  }

  @Override
  public @NonNull YearCycle cycle() {
    return mapCycle(islamicHoliday.getEvery() , YearCycle.class);
  }

  @Override
  public @NonNull List<MovingCondition> conditions() {
    return islamicHoliday.getMovingCondition().stream()
      .map(JacksonMovingCondition::new)
      .map(MovingCondition.class::cast)
      .toList();
  }
}