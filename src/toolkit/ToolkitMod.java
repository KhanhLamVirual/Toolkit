package toolkit;

import arc.util.Timer;
import mindustry.Vars;
import mindustry.core.GameState.State;
import mindustry.game.Team;
import mindustry.gen.Groups;
import mindustry.mod.Mod;
import mindustry.type.Item;
import mindustry.type.Liquid;
import mindustry.world.Block;
import mindustry.world.blocks.defense.turrets.Turret;

public class ToolkitMod extends Mod {
    public ToolkitMod() {
        
        Timer.schedule(() -> {
            Vars.state.rules.reactorExplosions = false;
            if (Vars.state.getState() != State.playing) {
                return;
            }

            if (Team.sharded.core() != null) {
                Vars.content.items().each((i) -> {
                    Team.sharded.core().items().set(i, 21000);
                });
            }
            
        }, 0.0f, 0.1f);
    }
}
