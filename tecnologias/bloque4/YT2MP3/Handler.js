class Handler {
    // this method establish a sequence of handlers in chain.
    setNext(handler) { // "handler" is the next handler in the chain
        this.nextHandler = handler; // this links the current handler to the next one
        console.log(`The next handler is assigned`);
        return handler;
    }

    // process the current step
    async handle(input) {
        if (this.nextHandler) { // checks if the current handler has another handler linked to it
            console.log(`Calling the handle `);
            return this.nextHandler.handle(input);
            // if "nextHandler" exists, it calls "handle" of the next handler object in the chain,
            // passing the same request and response objects
        }
        return null; // if there is no nextHandler (the current hanlder is the last one) the method returns null

    }



}
module.exports = Handler;