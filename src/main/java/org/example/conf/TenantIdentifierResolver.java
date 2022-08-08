package org.example.conf;

import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.stereotype.Component;

@Component
public class TenantIdentifierResolver implements CurrentTenantIdentifierResolver {

    private ThreadLocal<String> currentTenant = new ThreadLocal<>();

    public TenantIdentifierResolver() {
        currentTenant.set("unknown");
    }

    @Override
    public String resolveCurrentTenantIdentifier() {
        return currentTenant.get();
    }

    @Override
    public boolean validateExistingCurrentSessions() {
        return true;
    }

    public void setTenant(String tenant){
        this.currentTenant.set(tenant);
        return;
    }
}
