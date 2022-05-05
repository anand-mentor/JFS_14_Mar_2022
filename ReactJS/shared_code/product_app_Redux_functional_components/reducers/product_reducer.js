let initialState = {}
initialState.products = [{id:1, name: "Laptop", price: 50000, quantity: 25}]
initialState.selectedProduct = {}
initialState.renderForm = 'ADD_PRODUCT'

const productReducer = (state=initialState, action) => {
    switch(action.type) {
        case 'ADD_PRODUCT':
            state.products = action.payload;
            return state;
        case 'EDIT_PRODUCT':
            state.selectedProduct = action.payload;
            state.renderForm = 'EDIT_PRODUCT';
            return state;
        case 'DELETE_PRODUCT':
            state.products = action.payload;
            return state;
        case 'CANCEL_EDIT':
            state.renderForm = action.payload;
            return state;
        case 'UPDATE_PRODUCT':
            state.renderForm = action.payload.renderForm;
            state.products = action.payload.productList;
            return state;
        default:
            return state;
    }
}

export default productReducer;
