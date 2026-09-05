import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

    private ShoppingCart cart;

    @BeforeEach
    public void setUp() {
        cart = new ShoppingCart();
    }

    @Test
    public void testAddItemIncreasesCount() {
        cart.addItem("Book", 15.00);
        cart.addItem("Pen", 2.50);
        assertEquals(2, cart.getItemCount());
    }

    @Test
    public void testRemoveExistingItem() {
        cart.addItem("Book", 15.00);
        cart.removeItem("Book");
        assertEquals(0, cart.getItemCount());
    }

    @Test
    public void testCalculateTotalWithDiscount() {
        cart.addItem("Book", 100.00);
        double total = cart.calculateTotal(10.0); // 10% discount
        assertEquals(90.00, total, 0.001);
    }

    @Test
    public void testInvalidItemPriceThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            cart.addItem("Notebook", -5.0);
        });
    }

    @Test
    public void testInvalidDiscountPercentageThrowsException() {
        cart.addItem("Book", 50.0);
        assertThrows(IllegalArgumentException.class, () -> {
            cart.calculateTotal(150.0);
        });
    }
}