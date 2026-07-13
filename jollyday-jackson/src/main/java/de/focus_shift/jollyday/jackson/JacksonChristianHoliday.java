package de.focus_shift.jollyday.jackson;

import de.focus_shift.jollyday.core.HolidayType;
import de.focus_shift.jollyday.core.spi.ChristianHolidayConfiguration;
import de.focus_shift.jollyday.jackson.mapping.ChristianHoliday;
import de.focus_shift.jollyday.jackson.mapping.ChronologyType;
import org.jspecify.annotations.NonNull;
import org.threeten.extra.chrono.JulianChronology;

import java.time.Year;
import java.time.chrono.Chronology;
import java.time.chrono.IsoChronology;
import java.util.List;
import java.util.Optional;

class JacksonChristianHoliday extends AbstractJacksonHolidayConfiguration implements ChristianHolidayConfiguration {

  private final ChristianHoliday christianHoliday;

  JacksonChristianHoliday(ChristianHoliday christianHoliday) {
    this.christianHoliday = christianHoliday;
  }

  @Override
  public @NonNull ChristianHolidayType type() {
    return ChristianHolidayType.valueOf(christianHoliday.getType().name());
  }

  @Override
  public @NonNull Chronology chronology() {
    return christianHoliday.getChronology() == ChronologyType.JULIAN
      ? JulianChronology.INSTANCE
      : IsoChronology.INSTANCE;
  }

  @Override
  public @NonNull String descriptionPropertiesKey() {
    return mapDescriptionKey(christianHoliday.getDescriptionPropertiesKey(), descriptionPropertiesKeyPrefix(), descriptionPropertiesKeyPrefixSeparator(), type());
  }

  @Override
  public @NonNull HolidayType holidayType() {
    return mapHolidayType(christianHoliday.getLocalizedType());
  }

  @Override
  public @NonNull Optional<Year> validFrom() {
    return mapToYear(christianHoliday.getValidFrom());
  }

  @Override
  public @NonNull Optional<Year> validTo() {
    return mapToYear(christianHoliday.getValidTo());
  }

  @Override
  public @NonNull YearCycle cycle() {
    return mapCycle(christianHoliday.getEvery() , YearCycle.class);
  }

  @Override
  public @NonNull List<MovingCondition> conditions() {
    return christianHoliday.getMovingCondition().stream()
      .map(JacksonMovingCondition::new)
      .map(MovingCondition.class::cast)
      .toList();
  }
}