package top.alexmmd.springshelldemo.command;

import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellOption;

/**
 * @author 汪永晖
 * @date 2021/10/20 14:08
 */
@ShellComponent
public class MyCommands {

    @ShellMethod(value = "Add numbers.", key = "sum")
    public long add(long a, long b) {
        return a + b;
    }

    @ShellMethod(value = "sayHello")
    public String sayHello() {
        System.out.println("hello world");
        return "hello alex";
    }

    @ShellMethod("Display stuff.")
    public String echo(int a, int b, int c) {
        return String.format("You said a=%d, b=%d, c=%d", a, b, c);
    }

    @ShellMethod("Say hello.")
    public String greet(@ShellOption(defaultValue="World") String who) {
        return "Hello " + who;
    }

    @ShellMethod("Add Numbers.")
    public float add(@ShellOption(arity=3) float[] numbers) {
        return numbers[0] + numbers[1] + numbers[2];
    }

    @ShellMethod("Terminate the system.")
    public String shutdown(boolean force) {
        return "You said " + force;
    }
}
