package com.codesolutions.quarkus;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * LegacyResource - Functional example for legacy modernization with Quarkus.
 *
 * EN: Demonstrates modern Java/Quarkus as base for maintaining/evolving legacy Java EE/Play systems.
 * Ready to extend with Kafka, AI agent integration, DB access, etc.
 * 
 * PT: Demonstra Java moderno/Quarkus como base para manter/evoluir sistemas legados Java EE/Play.
 * Pronto para estender com Kafka, integração com agentes IA, acesso a DB, etc.
 *
 * Run: ./mvnw quarkus:dev
 * Then: curl http://localhost:8080/legacy
 *
 * See: https://ivamartins.github.io/code-solutions-site/ for full context and other bases.
 */
@Path("/legacy")
public class LegacyResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        // EN: Simulate response from modernized legacy service (e.g. old Play/JSF endpoint wrapped in Quarkus).
        // PT: Simula resposta de serviço legado modernizado (ex. endpoint antigo Play/JSF envolvido em Quarkus).
        return "Hello from Quarkus REST - legacy modernization base (Code Solutions example)";
    }
}
