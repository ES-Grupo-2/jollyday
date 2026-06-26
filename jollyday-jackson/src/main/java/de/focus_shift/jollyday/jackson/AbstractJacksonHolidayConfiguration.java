package de.focus_shift.jollyday.jackson;

import de.focus_shift.jollyday.core.HolidayType;
import java.time.Year;
import java.util.Optional;

public abstract class AbstractJacksonHolidayConfiguration {

  protected Optional<Year> mapToYear(Integer year) {
    return Optional.ofNullable(year).map(Year::of);
  }

  protected HolidayType mapHolidayType(Enum<?> localizedType) {
    return localizedType == null
      ? HolidayType.PUBLIC_HOLIDAY
      : HolidayType.valueOf(localizedType.name());
  }

  protected <E extends Enum<E>> E mapCycle(Enum<?> every, Class<E> targetEnumClass) {
    return every == null
      ? Enum.valueOf(targetEnumClass, "EVERY_YEAR")
      : Enum.valueOf(targetEnumClass, every.name());
  }

  protected String mapDescriptionKey(String customKey, String prefix, String separator, Enum<?> type) {
    return customKey == null
      ? prefix + separator + type.name()
      : customKey;
  }
}