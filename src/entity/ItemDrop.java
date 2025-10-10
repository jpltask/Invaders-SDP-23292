package entity;
import java.awt.Color;

import engine.GameState;
import engine.DrawManager.SpriteType;
import java.util.Random;

public class ItemDrop extends Entity {
    public enum ItemType {
        MultiShot,
        Atkspeed,
        Penetrate,
        Explode,
        Slow,
        Stop,
        Push,
        Shield,
        Heal;

        private static final ItemType[] VALUES = values();
        private static final int SIZE = VALUES.length;
        private static final Random RANDOM = new Random();

        public static ItemType selectItemType() {
            return VALUES[RANDOM.nextInt(SIZE)];
        }
    }

    private int speed;
    private ItemType itemType;
    public ItemDrop(final int positionX, final int positionY, final int speed, final ItemType itemType) {
        super(positionX, positionY, 5 * 5, 5 * 5, Color.WHITE);
        this.speed = speed;
        this.itemType = itemType;
        
        setSprite();
    }

    public final void setSprite(){ 
        switch (this.itemType) {
            case MultiShot:
                this.spriteType = SpriteType.Item_MultiShot;
                break;
            case Atkspeed:
                this.spriteType = SpriteType.Item_Atkspeed;
                break;
            case Penetrate:
                this.spriteType = SpriteType.Item_Penetrate;
                break;
            case Explode:
                this.spriteType = SpriteType.Item_Explode;
                break;
            case Slow:
                this.spriteType = SpriteType.Item_Slow;
                break;
            case Stop:
                this.spriteType = SpriteType.Item_Stop;
                break;
            case Push:
                this.spriteType = SpriteType.Item_Push;
                break;
            case Shield:
                this.spriteType = SpriteType.Item_Shield;
                break;
            case Heal:
                this.spriteType = SpriteType.Item_Heal;
                break;
        }
    }

    public final void update(){
        this.positionY += this.speed;
    }

    public final void setSpeed(final int speed) {
        this.speed = speed;
    }

    public final int getSpeed() {
        return this.speed;
    }

    public final ItemType getItemType() {
        return this.itemType;
    }

    public final void setItemType(final ItemType itemType) {
        this.itemType = itemType;
        this.setSprite();
    }
    public static ItemType getRandomItemType(final double proba) {
        if (Math.random() < proba){
            return ItemType.selectItemType();
        }
        else {
            return null;
        }
    }

    public void applyEffect(GameState gameState) { 
        switch (this.itemType) {
            case MultiShot:
                break;
            case Atkspeed:
                break;
            case Penetrate:
                break;
            case Explode:
                break;
            case Slow:
                break;
            case Stop:
                break;
            case Push:
                break;
            case Shield:
                break;
            case Heal:
                break;
        }
    }
}