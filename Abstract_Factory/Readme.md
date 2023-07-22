## Abstract Factory

Similar to Factory, it acts as a collection of factories. Rather than using "if-else" statements like in factory method, it defines interfaces which can be called directly.

In this example, we have the UI_Factory which calls WinFactory and MacFactory which have their own Buttons and CheckBoxes.

In the application, we just need to pass either WinFactory or MacFactory!
