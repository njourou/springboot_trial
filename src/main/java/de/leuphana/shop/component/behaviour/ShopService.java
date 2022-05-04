package de.leuphana.shop.component.behaviour;

public interface ShopService {

	Integer createCustomerWithCart();


	void removeArticleFromCart(Integer customerId, int articleId);

	void addArticleToCart(Integer customerId, Integer articleId);

	void decrementArticleQuantityInCart(Integer customerId, Integer articleId);

}
