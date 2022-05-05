const UpdateProductAction = (products, newProduct) => {

    products.map((product)=> {
        if(product.id === newProduct.id) {
            product.name = newProduct.name;
            product.quantity = newProduct.quantity;
            product.price = newProduct.price;
        }
    })
    return {
        type: 'UPDATE_PRODUCT',
        payload: { renderForm: 'ADD_PRODUCT', productList: [...products] }
    }
}

export default UpdateProductAction;
