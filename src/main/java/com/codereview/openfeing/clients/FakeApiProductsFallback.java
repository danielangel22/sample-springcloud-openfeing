package com.codereview.openfeing.clients;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class FakeApiProductsFallback implements FallbackFactory<FakeApiProducts> {

	@Override
	public FakeApiProducts create(Throwable cause) {
		return new FakeApiProducts() {

			@Override
			public ResponseEntity<Object> findAllProducts() {
				System.out.println("Ocurrio un error con el cliente products");
				cause.printStackTrace();
				return null;
			}

			@Override
			public ResponseEntity<Object> findAllCarts() {
				System.out.println("Ocurrio un error con el cliente carts");
				cause.printStackTrace();
				return null;
			}
		};
	}

}
