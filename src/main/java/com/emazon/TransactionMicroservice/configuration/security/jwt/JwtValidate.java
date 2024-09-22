package com.emazon.TransactionMicroservice.configuration.security.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import jakarta.servlet.http.HttpServletRequest;

public class JwtValidate {
    public static boolean tokenExists(HttpServletRequest request) {
        String header = request.getHeader(JwtConstants.JWT_HEADER);
        return header != null && header.startsWith(JwtConstants.JWT_BEARER);
    }

    public static Claims JwtValidation(HttpServletRequest request){
        String jwtToken = request.getHeader(JwtConstants.JWT_HEADER).replace(JwtConstants.JWT_BEARER, "");
        return Jwts.parser()
                .verifyWith(JwtConstants.getSignedKey(JwtConstants.JWT_SECRET_KEY))
                .build()
                .parseSignedClaims(jwtToken)
                .getPayload();
    }
}
