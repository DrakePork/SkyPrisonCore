package net.skyprison.Main.Commands.Opme;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;

public class Op implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (args.length == 1) {
				String name = args[0];
				Player player = Bukkit.getPlayer(name);

				if (player != null) {
					if (player.isOp()) {
						sender.sendMessage(ChatColor.RED + player.getName() + " is already opped!");
					} else {
						player.setOp(true);
						sender.sendMessage(ChatColor.GRAY + player.getName() + " has been opped!");
						Logger log = Bukkit.getLogger();
						log.info(ChatColor.RED + player.getName() + " has been opped!");
					}
				} else {
					sender.sendMessage(ChatColor.RED + "Player is not online.");
				}
			} else {
				sender.sendMessage(ChatColor.RED + "/op <player>");
			}
		} else {
			if (args.length == 1) {
				String name = args[0];
				Player player = Bukkit.getPlayer(name);

				if (player != null) {
					if (player.isOp()) {
						sender.sendMessage(ChatColor.RED + player.getName() + " is already opped!");
					} else {
						player.setOp(true);
						sender.sendMessage(ChatColor.GRAY + player.getName() + " has been opped!");
						Logger log = Bukkit.getLogger();
						log.info(ChatColor.RED + player.getName() + " has been opped!");
					}
				} else {
					sender.sendMessage(ChatColor.RED + "Player is not online.");
				}
			} else {
				sender.sendMessage(ChatColor.RED + "/op <player>");
			}
		}
		return true;
	}
}
