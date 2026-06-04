package com.viratbank.gatewayserver.config;

import org.jspecify.annotations.Nullable;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class KeyclockRoleConvertor implements Converter<Jwt, Collection<GrantedAuthority>> {


    @Override
    public @Nullable Collection<GrantedAuthority> convert(Jwt source) {

        Map<String,Object> realmAccess= (Map<String, Object>) source.getClaims().get("realm_access");

        if (realmAccess == null || realmAccess.isEmpty() )
        {
            return new ArrayList<>();
        }
        Collection<GrantedAuthority> grantedAuthorities = ((List<String>) realmAccess.get("roles"))
                .stream().map(roleName -> "ROLE_"+roleName)
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());

/*      for resourceAccess role convertor
  Collection<GrantedAuthority> authorities = new ArrayList<>();

        Map<String, Object> realmAccess = source.getClaim("realm_access");
        if (realmAccess != null && realmAccess.get("roles") instanceof List<?> roles) {
            roles.stream()
                    .map(Object::toString)
                    .map(role -> "ROLE_" + role)
                    .map(SimpleGrantedAuthority::new)
                    .forEach(authorities::add);
        }

        Map<String, Object> resourceAccess = source.getClaim("resource_access");
        if (resourceAccess != null) {
            Object clientAccessObj = resourceAccess.get("myclient");
            if (clientAccessObj instanceof Map<?, ?> clientAccess) {
                Object clientRolesObj = clientAccess.get("roles");
                if (clientRolesObj instanceof List<?> clientRoles) {
                    clientRoles.stream()
                            .map(Object::toString)
                            .map(role -> "ROLE_" + role)
                            .map(SimpleGrantedAuthority::new)
                            .forEach(authorities::add);
                }
            }
        }

        return authorities; */


        return grantedAuthorities;
    }
}
