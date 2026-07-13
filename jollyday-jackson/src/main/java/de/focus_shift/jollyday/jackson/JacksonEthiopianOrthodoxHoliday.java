package de.focus_shift.jollyday.jackson;

import de.focus_shift.jollyday.core.HolidayType;
import de.focus_shift.jollyday.core.spi.EthiopianOrthodoxHolidayConfiguration;
import de.focus_shift.jollyday.jackson.mapping.EthiopianOrthodoxHoliday;
import org.jspecify.annotations.NonNull;

import java.time.Year;
import java.util.Optional;

class JacksonEthiopianOrthodoxHoliday extends AbstractJacksonHolidayConfiguration implements EthiopianOrthodoxHolidayConfiguration {

  private final EthiopianOrthodoxHoliday ethiopianOrthodoxHoliday;

  JacksonEthiopianOrthodoxHoliday(EthiopianOrthodoxHoliday ethiopianOrthodoxHoliday) {
    this.ethiopianOrthodoxHoliday = ethiopianOrthodoxHoliday;
  }

  @Override
  public @NonNull String descriptionPropertiesKey() {
    return mapDescriptionKey(ethiopianOrthodoxHoliday.getDescriptionPropertiesKey(), descriptionPropertiesKeyPrefix(), descriptionPropertiesKeyPrefixSeparator(), type());
  }

  @Override
  public @NonNull HolidayType holidayType() {
    return mapHolidayType(ethiopianOrthodoxHoliday.getLocalizedType());
  }

  @Override
  public @NonNull EthiopianOrthodoxHolidayType type() {
    return EthiopianOrthodoxHolidayType.valueOf(ethiopianOrthodoxHoliday.getType().name());
  }

  @Override
  public @NonNull Optional<Year> validFrom() {
    return mapToYear(ethiopianOrthodoxHoliday.getValidFrom());
  }

  @Override
  public @NonNull Optional<Year> validTo() {
    return mapToYear(ethiopianOrthodoxHoliday.getValidTo());
  }

  @Override
  public @NonNull YearCycle cycle() {
    return mapCycle(ethiopianOrthodoxHoliday.getEvery(), YearCycle.class);
  }
}