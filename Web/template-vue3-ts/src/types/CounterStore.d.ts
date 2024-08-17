declare interface CounterStore {
    numRef: Ref<number>;
    doubleNumRef: ComputedRef<number>;
    increment(): void;
    decrement(): void;
    asyncIncrement(): Promise<void>;
    asyncDecrement(): Promise<void>;
}