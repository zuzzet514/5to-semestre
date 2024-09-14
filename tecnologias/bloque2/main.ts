import {NotificationManager} from "./NotificationManager";
import {DatabaseNotification} from "./DatabaseNotification";
import {EmailNotification} from "./EmailNotification";
import {PhoneNotification} from "./PhoneNotification";

const notificationManager = NotificationManager.getInstance();
const notificationManager2 = NotificationManager.getInstance();

const dbNotification = new DatabaseNotification(1);
const emailNotification = new EmailNotification('zu@uv.mx');
const phoneNotification = new PhoneNotification('922-1951336');

notificationManager.sendNotification('new user registered', dbNotification);
notificationManager.sendNotification('confirm your email', emailNotification);
notificationManager.sendNotification('your activation code is 598', phoneNotification);