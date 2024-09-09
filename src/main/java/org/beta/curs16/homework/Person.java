package org.beta.curs16.homework;

import lombok.Builder;

@Builder
public record Person(
        String firstName,
        String lastName,
        Integer age,
        String city
) {
}
