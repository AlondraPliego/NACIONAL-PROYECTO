package com.sospuebla.demo.alertas.dto;

public record VoluntarioNotificado(
        Long voluntarioId,
        String nombre,
        Double distanciaKm,
        String estado
) {
}
