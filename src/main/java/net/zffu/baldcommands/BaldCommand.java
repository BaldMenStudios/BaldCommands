package net.zffu.baldcommands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * A Command registered trough BaldCommands.
 */
public abstract class BaldCommand implements CommandExecutor {

    private String permission;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return false;
    }

    public boolean canRunCommand(CommandSender sender) {
        return sender.hasPermission(this.permission);
    }

}
