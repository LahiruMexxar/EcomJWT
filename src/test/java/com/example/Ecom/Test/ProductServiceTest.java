//package com.example.Ecom.Test;
//
//import com.example.Ecom.Repositories.ProductRepository;
//import com.example.Ecom.Services.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class ProductServiceTest {
//    @Autowired
//    private TestRestTemplate restTemplate;
//
//    @Autowired
//    private ProductService productService;
//
//    @MockBean
//    private ProductRepository productRepository;
//
//
////    @Test
////    public void testCreateProduct() {
////        // Given
////        Product newProduct = new Product("NewProduct", 200);
////
////        // When
////        ResponseEntity<ApiResponse<Product>> responseEntity = productService.saveProduct(newProduct);
////
////        // Then
////        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
////        assertNotNull(responseEntity.getBody());
////        assertEquals(newProduct.getName(), responseEntity.getBody().getPayload().getName());
////        assertEquals(newProduct.getPrice(), responseEntity.getBody().getPayload().getPrice());
////    }
//}
