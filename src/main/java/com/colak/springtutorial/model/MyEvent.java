package com.colak.springtutorial.model;


import java.time.LocalDateTime;
import java.util.UUID;

public record MyEvent(UUID id, Integer version, LocalDateTime occurredAt) {}
