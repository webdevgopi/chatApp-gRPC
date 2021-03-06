//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: chatapp/chat_app.proto

package proto.kotlin;

@kotlin.jvm.JvmSynthetic
inline fun fileDownloadChunk(block: proto.kotlin.FileDownloadChunkKt.Dsl.() -> Unit): proto.kotlin.FileDownloadChunk =
  proto.kotlin.FileDownloadChunkKt.Dsl._create(proto.kotlin.FileDownloadChunk.newBuilder()).apply { block() }._build()
object FileDownloadChunkKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: proto.kotlin.FileDownloadChunk.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: proto.kotlin.FileDownloadChunk.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): proto.kotlin.FileDownloadChunk = _builder.build()

    /**
     * <code>.proto.chat_app.FileDownloadChunk.FileDownload info = 1;</code>
     */
    var info: proto.kotlin.FileDownloadChunk.FileDownload
      @JvmName("getInfo")
      get() = _builder.getInfo()
      @JvmName("setInfo")
      set(value) {
        _builder.setInfo(value)
      }
    /**
     * <code>.proto.chat_app.FileDownloadChunk.FileDownload info = 1;</code>
     */
    fun clearInfo() {
      _builder.clearInfo()
    }
    /**
     * <code>.proto.chat_app.FileDownloadChunk.FileDownload info = 1;</code>
     * @return Whether the info field is set.
     */
    fun hasInfo(): kotlin.Boolean {
      return _builder.hasInfo()
    }

    /**
     * <code>bytes content = 2;</code>
     */
    var content: com.google.protobuf.ByteString
      @JvmName("getContent")
      get() = _builder.getContent()
      @JvmName("setContent")
      set(value) {
        _builder.setContent(value)
      }
    /**
     * <code>bytes content = 2;</code>
     */
    fun clearContent() {
      _builder.clearContent()
    }
    /**
     * <code>bytes content = 2;</code>
     * @return Whether the content field is set.
     */
    fun hasContent(): kotlin.Boolean {
      return _builder.hasContent()
    }
    val downloadDataCase: proto.kotlin.FileDownloadChunk.DownloadDataCase
      @JvmName("getDownloadDataCase")
      get() = _builder.getDownloadDataCase()

    fun clearDownloadData() {
      _builder.clearDownloadData()
    }
  }
  @kotlin.jvm.JvmSynthetic
  inline fun fileDownload(block: proto.kotlin.FileDownloadChunkKt.FileDownloadKt.Dsl.() -> Unit): proto.kotlin.FileDownloadChunk.FileDownload =
    proto.kotlin.FileDownloadChunkKt.FileDownloadKt.Dsl._create(proto.kotlin.FileDownloadChunk.FileDownload.newBuilder()).apply { block() }._build()
  object FileDownloadKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    class Dsl private constructor(
      @kotlin.jvm.JvmField private val _builder: proto.kotlin.FileDownloadChunk.FileDownload.Builder
    ) {
      companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: proto.kotlin.FileDownloadChunk.FileDownload.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): proto.kotlin.FileDownloadChunk.FileDownload = _builder.build()

      /**
       * <code>string file_name = 1;</code>
       */
      var fileName: kotlin.String
        @JvmName("getFileName")
        get() = _builder.getFileName()
        @JvmName("setFileName")
        set(value) {
          _builder.setFileName(value)
        }
      /**
       * <code>string file_name = 1;</code>
       */
      fun clearFileName() {
        _builder.clearFileName()
      }

      /**
       * <code>.proto.chat_app.ChatMessage chat_message = 2;</code>
       */
      var chatMessage: proto.kotlin.ChatMessage
        @JvmName("getChatMessage")
        get() = _builder.getChatMessage()
        @JvmName("setChatMessage")
        set(value) {
          _builder.setChatMessage(value)
        }
      /**
       * <code>.proto.chat_app.ChatMessage chat_message = 2;</code>
       */
      fun clearChatMessage() {
        _builder.clearChatMessage()
      }
      /**
       * <code>.proto.chat_app.ChatMessage chat_message = 2;</code>
       * @return Whether the chatMessage field is set.
       */
      fun hasChatMessage(): kotlin.Boolean {
        return _builder.hasChatMessage()
      }
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun proto.kotlin.FileDownloadChunk.copy(block: proto.kotlin.FileDownloadChunkKt.Dsl.() -> Unit): proto.kotlin.FileDownloadChunk =
  proto.kotlin.FileDownloadChunkKt.Dsl._create(this.toBuilder()).apply { block() }._build()
@kotlin.jvm.JvmSynthetic
inline fun proto.kotlin.FileDownloadChunk.FileDownload.copy(block: proto.kotlin.FileDownloadChunkKt.FileDownloadKt.Dsl.() -> Unit): proto.kotlin.FileDownloadChunk.FileDownload =
  proto.kotlin.FileDownloadChunkKt.FileDownloadKt.Dsl._create(this.toBuilder()).apply { block() }._build()
