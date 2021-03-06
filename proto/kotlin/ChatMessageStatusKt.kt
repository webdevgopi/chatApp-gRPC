//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: chatapp/chat_app.proto

package proto.kotlin;

@kotlin.jvm.JvmSynthetic
inline fun chatMessageStatus(block: proto.kotlin.ChatMessageStatusKt.Dsl.() -> Unit): proto.kotlin.ChatMessageStatus =
  proto.kotlin.ChatMessageStatusKt.Dsl._create(proto.kotlin.ChatMessageStatus.newBuilder()).apply { block() }._build()
object ChatMessageStatusKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: proto.kotlin.ChatMessageStatus.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: proto.kotlin.ChatMessageStatus.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): proto.kotlin.ChatMessageStatus = _builder.build()

    /**
     * <code>.proto.chat_app.ChatMessage chat_message = 1;</code>
     */
    var chatMessage: proto.kotlin.ChatMessage
      @JvmName("getChatMessage")
      get() = _builder.getChatMessage()
      @JvmName("setChatMessage")
      set(value) {
        _builder.setChatMessage(value)
      }
    /**
     * <code>.proto.chat_app.ChatMessage chat_message = 1;</code>
     */
    fun clearChatMessage() {
      _builder.clearChatMessage()
    }
    /**
     * <code>.proto.chat_app.ChatMessage chat_message = 1;</code>
     * @return Whether the chatMessage field is set.
     */
    fun hasChatMessage(): kotlin.Boolean {
      return _builder.hasChatMessage()
    }

    /**
     * <code>.proto.chat_app.ChatMessageStatus.MessageStatus msg_status = 2;</code>
     */
    var msgStatus: proto.kotlin.ChatMessageStatus.MessageStatus
      @JvmName("getMsgStatus")
      get() = _builder.getMsgStatus()
      @JvmName("setMsgStatus")
      set(value) {
        _builder.setMsgStatus(value)
      }
    /**
     * <code>.proto.chat_app.ChatMessageStatus.MessageStatus msg_status = 2;</code>
     */
    fun clearMsgStatus() {
      _builder.clearMsgStatus()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun proto.kotlin.ChatMessageStatus.copy(block: proto.kotlin.ChatMessageStatusKt.Dsl.() -> Unit): proto.kotlin.ChatMessageStatus =
  proto.kotlin.ChatMessageStatusKt.Dsl._create(this.toBuilder()).apply { block() }._build()
