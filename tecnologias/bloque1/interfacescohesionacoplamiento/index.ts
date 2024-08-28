class Product{
    private _id: number
    private _name: string
    private _price: number
    private _discount: number

    constructor(id: number, name: string, price: number) {
        this._id = id
        this._name = name
        this._price = price
        this._discount = 0
    }


    get id(): number {
        return this._id;
    }

    set id(value: number) {
        this._id = value;
    }

    get name(): string {
        return this._name;
    }

    set name(value: string) {
        this._name = value;
    }

    get price(): number {
        return this._price;
    }

    set price(value: number) {
        this._price = value;
    }

    get discount(): number {
        return this._discount;
    }

    set discount(value: number) {
        this._discount = value;
    }

    getPriceWithDiscount(): number {
        return this._price * (1 - this._discount / 100);
    }

    applyDiscount(discount: number): number {
        this._discount = discount;
        return this.getPriceWithDiscount()
    }
}

interface NotificationService {
    sendNotification(message: string): void
}

class EmailNotificationService implements NotificationService {
    sendNotification(message: string) {
        console.log(`Sending ${message}`);
    }
}

class SMSNotificationService implements NotificationService {
    private phoneNumber: string

    constructor(phoneNumber: string) {
        this.phoneNumber = phoneNumber
    }

    sendNotification(message: string):void {
        console.log(`Sending ${message} to ${this.phoneNumber}`);
    }
}

export class ShoppingCart {
    private products: Product[];
    private notificationService: NotificationService;

    constructor(notificationService: NotificationService) {
        this.notificationService = notificationService;
        this.products = []
    }

    addProduct(...newProducts): void {
        newProducts.forEach(product => this.products.push(product));
    }

    showProducts(): void {
        console.log("Comparate:")
        this.products.forEach((product, index) => {
            if (product.discount() > 0) {
                console.log(
                    `${index + 1}, ${product.name}, precio original`
                )
            } else {
                console.log(` ${index +1}. ${product.name}, precio ${product.price}`)
            }
        })
    }

    checkout() {
        this.notificationService.sendNotification("Checkout")
    }
}