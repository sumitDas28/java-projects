package com.sumit.learnjava.jwt;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Date;
import java.util.Random;

import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

public class JWTSecretKeyExample {

	public static void main(String[] args) {

		Instant now = Instant.now();

		byte[] secretKey = Base64.getDecoder().decode("cmbLuc7cM+9CPNZs610knGvKuXp4ayGnRfHljvdHvww=");

		System.out.println("secretKey: " + secretKey);

		String jwt = Jwts.builder().setSubject("Sumit Das").setAudience("View Demo")
				.claim("id20", new Random().nextInt(20) + 1).setIssuedAt(Date.from(now))
				.setExpiration(Date.from(now.plus(1, ChronoUnit.MINUTES))).signWith(Keys.hmacShaKeyFor(secretKey))
				.compact();

		System.out.println("jwt: " + jwt);

		Jwt result = Jwts.parserBuilder().setSigningKey(Keys.hmacShaKeyFor(secretKey)).build().parse(jwt);

		System.out.println("result: " + result.toString());

	}

}
