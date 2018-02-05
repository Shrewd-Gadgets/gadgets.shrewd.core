package gadgets.shrewd.core;

import java.util.Optional;

/**
 * A simple stack interface that manages data retention for specific collections
 * of elements.
 */
public interface Stackable<DATA> {

    /**
     * Adds the supplied element to the "top" of the stack.
     * NULL element handling is deferred to implementation specifications.
     * @param datum A single data element.
     */
    void push(DATA datum);

    /**
     * Returns the element currently at the "top" of the stack, if there is one.
     * Once the element has been popped, the previously added element is now at the "top" of the stack.
     * @return Top most stack element, if it's available.
     */
    Optional<DATA> pop();

    /**
     * Returns the current size fo the stack, i.e. the current number of elements.
     * @return Current count of elements in the stack.
     */
    Integer size();

    /**
     * Checks to see if the stack contains any elements.
     * @return True if the stack has at least one element.
     */
    boolean isEmpty();
}
